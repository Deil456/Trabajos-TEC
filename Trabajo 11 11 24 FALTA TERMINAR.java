import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int sumaValores(int[] arreglo) {
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        return suma;
    }

    public static int valoresUnicos(Object[] arreglo) {
        Set<Object> conjuntoUnico = new HashSet<>();
        for (Object obj : arreglo) {
            conjuntoUnico.add(obj);
        }
        return conjuntoUnico.size();
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma de valores: " + sumaValores(numeros));

        Object[] objetos = {"Hola", 1, 2, "Hola", 3.5, 1, "Adiós"};
        System.out.println("Cantidad de valores unicos: " + valoresUnicos(objetos));
    }
}