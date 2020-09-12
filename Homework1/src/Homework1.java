import java.util.Scanner;

public class Homework1 {
    static int countOfBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (countOfBits(i) == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
