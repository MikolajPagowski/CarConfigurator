package pl.pagowski.mikolaj.carconfiguratorsystem.Engine;

public interface Engine {
    EEngineType getType();
    String getName();
    int getHorsePower();
    String getTransmission();
    // engine capacity
    int getCC();
}
