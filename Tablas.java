import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numero = new ArrayList();
        ArrayList numero2 = new ArrayList();
        ArrayList Multiplicacion = new ArrayList();
        double i;
        for (i = 1; i <= 10; i++) {
            int j;
            numero.add(i);
            for (j = 1; j <= 10; j++) {
                numero2.add(j);
                Multiplicacion.add(j * i);
                System.out.println(numero.getLast() + "*" + numero2.getLast() + "=" + Multiplicacion.getLast());
            }

        }

    }
}