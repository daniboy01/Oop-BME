import java.util.ArrayList;
import java.util.Scanner;

public class ListákFeltöltése {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        fillArray(numbers,sc);
        higherThanAverage(numbers,average(numbers));
    }
    public static void fillArray(ArrayList<Integer> numbers,Scanner sc){
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }
    }
    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        return sum/numbers.size();
    }

    public static void higherThanAverage(ArrayList<Integer> numbers,double ave) {
        for (int x : numbers) {
            if (x > ave) {
                System.out.println(x);
            }
        }
    }
}
