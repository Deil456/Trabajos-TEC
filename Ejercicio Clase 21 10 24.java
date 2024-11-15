import java.util.Random;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] numeros = new int[100]; // Crear un arreglo de 100 elementos
        Random random = new Random();

        // Asignar valores aleatorios entre 500 y 1000 al arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 500 + random.nextInt(501); // Genera valores entre 500 y 1000
        }

        // Mostrar el arreglo antes del ordenamiento
        System.out.println("Arreglo antes del ordenamiento:");
        mostrarArreglo(numeros);

        // Ordenar el arreglo utilizando el método de burbuja
        ordenarBurbuja(numeros);

        // Mostrar el arreglo después del ordenamiento
        System.out.println("\nArreglo después del ordenamiento:");
        mostrarArreglo(numeros);
    }

    // Método para ordenar un arreglo con el algoritmo de burbuja
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Intercambiar si el elemento actual es mayor que el siguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método para mostrar los elementos de un arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}