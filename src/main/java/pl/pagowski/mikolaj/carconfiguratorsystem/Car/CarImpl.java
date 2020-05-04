package pl.pagowski.mikolaj.carconfiguratorsystem.Car;

import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.Engine;

public class CarImpl implements Car {

    private String name;
    private Engine engine;
    private String color;
    private int wheelSize;

    public CarImpl(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }
}
