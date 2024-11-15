import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para ingresar numeros ENTEROS");
        System.out.println("para detener ingrese un numero NEGATIVO");
        System.out.println("No se permiten numeros DUPLICADOS\n");

        while (true) {
            System.out.print("Ingrese un numero entero: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Numero negativo detectado, terminando el programa.");
                break;
            }

            if (numeros.contains(numero)) {
                System.out.println("El numero " + numero + " ya fue ingresado, intente con otro");
            } else {
                numeros.add(numero);
                suma += numero;
            }
        }

        System.out.println("\nNumeros ingresados: " + numeros);
        System.out.println("La suma de todos los numeros es: " + suma);

        scanner.close();
    }
}