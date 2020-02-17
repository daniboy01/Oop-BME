import java.util.Scanner;

public class TömbökFeltöltése {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbs = new int[10];
        for (int i = 0; i < 10; i++) {
            numbs[i] = sc.nextInt();
        }
        higherThanAverage(numbs,avarage(numbs));
    }
    public static double avarage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum/numbers.length;
    }
    public static void higherThanAverage(int[] numbs, double ave) {
        for (int x : numbs) {
            if (x > ave){
                System.out.println(x);
            }
        }
    }
}
