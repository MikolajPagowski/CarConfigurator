package pl.pagowski.mikolaj.carconfiguratorsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.pagowski.mikolaj.carconfiguratorsystem.Car.Car;
import pl.pagowski.mikolaj.carconfiguratorsystem.Engine.Engine;
import pl.pagowski.mikolaj.carconfiguratorsystem.Service.CarOfferService;


@SpringBootApplication
public class AppMain implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(AppMain.class);

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    CarOfferService carOfferService;

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        Engine engine1 = applicationContext.getBean("enginePetrol25", Engine.class);
        Engine engine2 = applicationContext.getBean("enginePetrol29", Engine.class);

        Car car1 = applicationContext.getBean("Audi RS3", Car.class);
        Car car2 = applicationContext.getBean("Audi RS4", Car.class);

        LOG.info("engine1==engine2 = {}", engine1 == engine2);
        LOG.info("car1==car2 = {}", car1 == car2);

        prepareAndSendOffer("Audi RS4", "Zielony", 19, "miki@miki.pl");
        prepareAndSendOffer("Audi A1", "Grafit", 17, "piotr@noga.eu");
        prepareAndSendOffer("Audi RS6", "Czarny", 21, "audi@fan.pl");
        prepareAndSendOffer("Audi RS3", "Nardo", 19, "miki@pago.pl");


    }

    private void prepareAndSendOffer(String carBeanName, String carColor, int carWheelSize, String clientMail) {
        Car car = applicationContext.getBean(carBeanName, Car.class);

        car.setColor(carColor);
        car.setWheelSize(carWheelSize);

        carOfferService.prepareAndSendOffer(car, clientMail);
    }
}
