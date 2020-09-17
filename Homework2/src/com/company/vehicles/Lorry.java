package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, Driver driver, String carModel, Engine engine, int carrying) {
        super(carClass, driver, carModel, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
