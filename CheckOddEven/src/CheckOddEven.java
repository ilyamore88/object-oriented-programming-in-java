import java.util.Scanner;

public class CheckOddEven {
    static void printStatistic(int oddCount, int evenCount) {
        System.out.println("Нечётных чисел: " + oddCount + "\nЧётных чисел: " + evenCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oddCount = 0, evenCount = 0;

        while (true) {
            String input = in.next();

            if (input.equals("end")) {
                printStatistic(oddCount, evenCount);
                System.exit(0);
            }

            try {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                System.out.println(number % 2 == 0 ? "Чётное число" : "Нечётное число");
            } catch (NumberFormatException exception) {
                System.out.println("Ошибка формата ввода");
                System.out.println(exception);
                printStatistic(oddCount, evenCount);
                System.exit(1);
            }
        }
    }
}
