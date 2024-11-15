import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 101; i <= 200; i++) {
            arrayList.add(i);
        }

        ArrayList<Integer> combinacion = new ArrayList<>();

        for (int num : array) {
            combinacion.add(num);
        }

        combinacion.addAll(arrayList);

        System.out.println("Array (1 al 100): " + Arrays.toString(array));

        System.out.println("ArrayList (101 al 200): " + arrayList);
        
        System.out.println("Array y Arraylist combinados (1 al 200): " + combinacion);
    }
}