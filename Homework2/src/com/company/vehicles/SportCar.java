package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String carClass, Driver driver, String carModel, Engine engine, int speed) {
        super(carClass, driver, carModel, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
