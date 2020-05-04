package pl.pagowski.mikolaj.carconfiguratorsystem.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.pagowski.mikolaj.carconfiguratorsystem.Car.Car;
import pl.pagowski.mikolaj.carconfiguratorsystem.Car.CarImpl;
import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.EEngineType;
import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.Engine;
import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.EngineImpl;

@Configuration
public class AppConfig {

    @Value("${engine.petrol.14:}")
    private String enginePetrol14Name;

    @Value("${engine.petrol.20:}")
    private String enginePetrol20Name;

    @Value("${engine.petrol.25:}")
    private String enginePetrol25Name;

    @Value("${engine.petrol.29:}")
    private String enginePetrol29Name;

    @Value("${engine.petrol.40:}")
    private String enginePetrol40Name;

    @Value("${car.audi.a1}")
    private String carAudiA1Name;

    @Value("${car.audi.s3}")
    private String carAudiS3Name;

    @Value("${car.audi.rs3}")
    private String carAudiRS3Name;

    @Value("${car.audi.rs4}")
    private String carAudiRS4Name;

    @Value("${car.audi.rs6}")
    private String carAudiRS6Name;

    @Bean("enginePetrol14")
    public Engine enginePetrol14() {
        return new EngineImpl(EEngineType.PETROL, enginePetrol14Name, 140, "MQ200", 1399);
    }

    @Bean("enginePetrol20")
    public Engine enginePetrol20() {
        return new EngineImpl(EEngineType.PETROL, enginePetrol20Name, 310, "DQ381", 1998);
    }

    @Bean("enginePetrol25")
    public Engine enginePetrol25() {
        return new EngineImpl(EEngineType.PETROL, enginePetrol25Name, 400, "DQ500", 2499);
    }

    @Bean("enginePetrol29")
    public Engine enginePetrol29() {
        return new EngineImpl(EEngineType.PETROL, enginePetrol29Name, 450, "DQ500", 2899);
    }

    @Bean("enginePetrol40")
    @Scope("prototype")
    public Engine enginePetrol40() {
        return new EngineImpl(EEngineType.PETROL, enginePetrol40Name, 605, "DQ500", 3998);
    }

    @Bean("Audi A1")
    @Scope("prototype")
    public Car audiA1() {
        return new CarImpl(carAudiA1Name, enginePetrol14());
    }

    @Bean("Audi S3")
    @Scope("prototype")
    public Car audiS3() {
        return new CarImpl(carAudiS3Name, enginePetrol20());
    }

    @Bean("Audi RS3")
    @Scope("prototype")
    public Car audiRS3() {
        return new CarImpl(carAudiRS3Name, enginePetrol25());
    }

    @Bean("Audi RS4")
    @Scope("prototype")
    public Car audiRS4() {
        return new CarImpl(carAudiRS4Name, enginePetrol29());
    }

    @Bean("Audi RS6")
    @Scope("prototype")
    public Car audiRS6() {
        return new CarImpl(carAudiRS6Name, enginePetrol40());
    }


}
