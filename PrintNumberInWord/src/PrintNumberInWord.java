import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = in.next();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0') {
                System.out.print("Ноль ");
            } else if (c == '1') {
                System.out.print("Один ");
            } else if (c == '2') {
                System.out.print("Два ");
            } else if (c == '3') {
                System.out.print("Три ");
            } else if (c == '4') {
                System.out.print("Четыре ");
            } else if (c == '5') {
                System.out.print("Пять ");
            } else if (c == '6') {
                System.out.print("Шесть ");
            } else if (c == '7') {
                System.out.print("Семь ");
            } else if (c == '8') {
                System.out.print("Восемь ");
            } else if (c == '9') {
                System.out.print("Девять ");
            } else {
                System.out.print("Другое ");
            }
        }
        System.out.println();
    }
}
