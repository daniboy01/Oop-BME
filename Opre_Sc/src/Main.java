
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = readIn();
        int [] numbs = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbs[i] = Integer.parseInt(data[i]);
        }

        run(numbs);
    }
    public static String[] readIn(){
        Scanner sc = new Scanner(System.in);
        while (true){
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            String [] data = line.split(",");
            return data;
        }
        return null;
    }

    public static boolean find(int x, int[] numbers, boolean[] sc) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                sc[i] = true;
                return true;
            }
        }
        return false;
    }

    public static int change(int x, int[] numbers, boolean[] sc, int index) {
        while (true) {
            if (!sc[index]) {
                numbers[index] = x;
                return (index + 1) % numbers.length;
            }
            sc[index] = false;
            index = (index + 1) % numbers.length;
        }
    }

    public static void run(int[] input) {
        String result = "";
        int index = 0;
        int page_fault = 0;
        char[] frames = new char[]{'A', 'B', 'C','D'};

        int[] numbers = new int[4];
        boolean[] sc = new boolean[4];

        for (int i = 0; i < input.length; i++) {
            if (!find(input[i], numbers, sc)) {
                index = change(input[i], numbers, sc, index);
                page_fault++;
                if (index - 1 < 0) {
                    result += frames[3];
                } else {
                    result += frames[index - 1];
                }

            } else {
                result += '-';
            }
        }
        System.out.println(result);
        System.out.println(page_fault);

    }
}
