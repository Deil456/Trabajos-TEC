import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 101; i <= 200; i++) {
            arrayList2.add(i);
        }

        ArrayList<Integer> combinedList = new ArrayList<>();

        for (int num : array1) {
            combinedList.add(num);
        }

        combinedList.addAll(arrayList2);

        System.out.println("del 1 al 100:");
        System.out.println(Arrays.toString(array1));
        System.out.println("\ndel 101 al 200:");
        System.out.println(arrayList2);
        System.out.println("\nequivalentes:");
        System.out.println(combinedList);
    }
}