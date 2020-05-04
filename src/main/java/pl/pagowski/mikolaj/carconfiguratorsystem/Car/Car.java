package pl.pagowski.mikolaj.carconfiguratorsystem.Car;

import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.Engine;

public interface Car {
    String getName();

    Engine getEngine();

    void setColor(String color);

    String getColor();

    void setWheelSize(int wheelSize);

    int getWheelSize();
}
