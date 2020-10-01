import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI bmi = new BMI("Ilya", 19, weight, height);

        double result = bmi.getBMI();

        // Display result
        System.out.println("BMI is " + result);
        if (result < 18.5)
            System.out.println("Underweight");
        else if (result < 25)
            System.out.println("Normal");
        else if (result < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
