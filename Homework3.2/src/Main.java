import java.util.Scanner;

public class Main implements IntSequence {
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Main main = new Main();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += main.next();
        }

        System.out.println("Сумма введённых числе равна " + sum);
    }
}
