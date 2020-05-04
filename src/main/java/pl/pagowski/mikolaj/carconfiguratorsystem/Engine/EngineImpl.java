package pl.pagowski.mikolaj.carconfiguratorsystem.Engine;

public class EngineImpl implements Engine {

    private EEngineType type;
    private String name;
    private int horsepower;
    private String transmission;
    private int cc;

    public EngineImpl(EEngineType type, String name, int horsepower, String transmission, int cc) {
        this.type = type;
        this.name = name;
        this.horsepower = horsepower;
        this.transmission = transmission;
        this.cc = cc;
    }

    public EEngineType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsepower;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getCC() {
        return cc;
    }
}
