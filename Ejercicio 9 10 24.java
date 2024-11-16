import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("elige la figura para sacar area:");
        System.out.println("1.-triangulo");
        System.out.println("2.-circulo");
        System.out.println("3.-rectangulo");
        System.out.println("4.-cuadrado");
        System.out.println("5.-salir");
        Scanner sc = new Scanner(System.in);
        int figura = sc.nextInt();
        double numero1;
        double numero2;

        switch (figura) {
            case 1:
                System.out.println("dame la altura:");
                numero1 = sc.nextFloat();
                System.out.println("dame la base:");
                numero2 = sc.nextFloat();
                System.out.println("El area del triangulo es: " + (numero1 * numero2 / 2));

            case 2:
                System.out.println("dame el radio:");
                numero1 = sc.nextFloat();
                System.out.println("El area del circulo es: " + (Math.PI * Math.pow(numero1, 2)));

            case 3:

            case 4:

            case 5:

                break;
            default:
                throw new AssertionError();
        }

    }
}