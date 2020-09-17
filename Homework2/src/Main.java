import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Driver carDriver = createDriver();
            Engine sportEngine = createEngine();
            Engine powerEngine = createEngine();

            SportCar sportCar = createSportCar(carDriver, sportEngine);
            Lorry lorry = createLorry(carDriver, powerEngine);

            sportCar.start();
            sportCar.turnLeft();
            sportCar.stop();

            lorry.start();
            lorry.turnRight();
            lorry.stop();

            System.out.println("Спортивный автомобиль:\n" + sportCar);
            System.out.println("Грузовой автомобиль:\n" + lorry);
            System.out.println("Водитель:\n" + carDriver);
            System.out.println("Двигатели:\n" + sportEngine + "\n" + powerEngine);
        } catch (Exception exception) {
            System.out.println("Something went wrong");
            System.out.println(exception);
        }
    }

    private static Driver createDriver() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите возраст водителя:");
        int driverAge = sc.nextInt();

        System.out.println("Введите ФИО водителя:");
        String driverName = reader.readLine();

        System.out.println("Введите стаж водителя:");
        int driverExperience = sc.nextInt();

        return new Driver(driverAge, driverName, driverExperience);
    }

    private static Engine createEngine() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите производителя двигателя:");
        String engineCompany = sc.nextLine();

        System.out.println("Введите мощность двигателя:");
        int enginePower = sc.nextInt();

        return new Engine(enginePower, engineCompany);
    }

    private static SportCar createSportCar(Driver driver, Engine engine) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите класс автомобиля:");
        String carClass = sc.nextLine();

        System.out.println("Введите марку автомобиля:");
        String carModel = sc.nextLine();

        System.out.println("Введите скорость автомобиля:");
        int speed = sc.nextInt();

        return new SportCar(carClass, driver, carModel, engine, speed);
    }

    private static Lorry createLorry(Driver driver, Engine engine) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите класс автомобиля:");
        String carClass = sc.nextLine();

        System.out.println("Введите марку автомобиля:");
        String carModel = sc.nextLine();

        System.out.println("Введите грузоподъёмность автомобиля:");
        int carrying = sc.nextInt();

        return new Lorry(carClass, driver, carModel, engine, carrying);
    }
}
