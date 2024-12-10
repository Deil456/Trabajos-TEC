import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

// SE DEBE DE PONER LA RUTA DE LA IMAGEN PRIMERO EN LA LINEA 21

public class ImagenesEjemplo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mostrar imagen");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600); // Tamaño inicial de la ventana

            JPanel panel = new JPanel() {
                BufferedImage imagen;
                
                {
                    try {
                        imagen = ImageIO.read(new File("C:\\Users\\HectorCastro\\Downloads\\EPiE0jTVUAAoHqE.jpg"));
                    } catch (Exception e) {
                        System.err.println("No se pudo cargar la imagen: " + e.getMessage());
                    }
                }

                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (imagen != null) {
                        int x = (getWidth() - imagen.getWidth()) / 2;
                        int y = (getHeight() - imagen.getHeight()) / 2;
                        g.drawImage(imagen, x, y, this);
                    }
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
