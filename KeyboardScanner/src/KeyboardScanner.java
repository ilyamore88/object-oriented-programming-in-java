import java.util.Scanner;

public class KeyboardScanner {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        num1 = in.nextInt();
        System.out.print("Введите вещественное число: ");
        num2 = in.nextDouble();
        System.out.print("Введите Ваше имя: ");
        name = in.next();

        System.out.println("Привет, " + name + ", сумма " + num1 + " и " + num2 + " = " + (num1 + num2));
    }
}
