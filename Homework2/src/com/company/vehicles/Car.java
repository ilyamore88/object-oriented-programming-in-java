package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carClass;
    private Driver driver;
    private String carModel;
    private Engine engine;

    public Car(String carClass, Driver driver, String carModel, Engine engine) {
        this.carClass = carClass;
        this.driver = driver;
        this.carModel = carModel;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Автомобиль " + carModel + " едет вперёд");
    }

    public void stop() {
        System.out.println("Автомобиль " + carModel + " остановился");
    }

    public void turnRight() {
        System.out.println("Автомобиль " + carModel + " повернул направо");
    }

    public void turnLeft() {
        System.out.println("Автомобиль " + carModel + " повернул налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", driver=" + driver +
                ", carModel='" + carModel + '\'' +
                ", engine=" + engine +
                '}';
    }
}
