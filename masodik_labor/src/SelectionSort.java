import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int [] numbs = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbs[i] = sc.nextInt();
        }
        printArray(numbs);
        System.out.println();
        selection_sort(numbs);
        System.out.println();
        printArray(numbs);
    }
    public static void selection_sort(int[] numbs) {
        int length = numbs.length;
        for (int i = 0; i < length; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (numbs[j] < numbs[min_index]) {
                    min_index = j;
                }
            }
            int temp = numbs[min_index];
            numbs[min_index] = numbs[i];
            numbs[i] = temp;
        }
    }
    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.println(x + " ");
        }
    }
}
