import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Operaciones aritmeticas");
            System.out.println("2. Conversion a bases numericas");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operacionesAritmeticas(scanner);
                    break;
                case 2:
                    conversionBases(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida intente de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    public static void operacionesAritmeticas(Scanner scanner) {
        System.out.println("ingrese el primer numero:");
        double num1 = scanner.nextDouble();

        System.out.println("ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operacion:");
        System.out.println("A para Suma");
        System.out.println("B para Resta");
        System.out.println("C para Multiplicación");
        System.out.println("D para División");

        char operacion = scanner.next().charAt(0);
        double resultado = (0);

        switch (operacion) {
            case 'A':
                resultado = sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 'B':
                resultado = restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 'C':
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 'D':
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void conversionBases(Scanner scanner) {
        System.out.println("Ingrese un numero entero decimal:");
        int numero = scanner.nextInt();

        System.out.println("Binario: " + Integer.toBinaryString(numero));
        System.out.println("Octal: " + Integer.toOctalString(numero));
        System.out.println("Hexadecimal: " + Integer.toHexString(numero).toUpperCase());
    }
}