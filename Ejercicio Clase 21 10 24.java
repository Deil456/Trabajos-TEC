import java.util.Random;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] numeros = new int[100]; 
        Random random = new Random();
       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 500 + random.nextInt(501); 
        }

        System.out.println("Arreglo antes del ordenamiento:");
        mostrarArreglo(numeros);

        ordenarBurbuja(numeros);

        System.out.println("\nArreglo despues del ordenamiento:");
        mostrarArreglo(numeros);
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
