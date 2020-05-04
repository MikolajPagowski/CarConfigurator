package pl.pagowski.mikolaj.carconfiguratorsystem.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.pagowski.mikolaj.carconfiguratorsystem.Car.Car;
import pl.pagowski.mikolaj.carconfiguratorsystem.Creator.CarOfferCreator;

import javax.xml.ws.ServiceMode;

@Service
public class CarOfferServiceImpl implements CarOfferService {

    private static final Logger LOG = LoggerFactory.getLogger(CarOfferServiceImpl.class);
    private CarOfferCreator carOfferCreator;

    public CarOfferServiceImpl(CarOfferCreator carOfferCreator) {
        this.carOfferCreator = carOfferCreator;
    }

    public void prepareAndSendOffer(Car car, String email) {

        String offer = carOfferCreator.createCarOffer(car);

        LOG.info(offer);

        LOG.info("Sending offer to {} ....... Sent", email);

    }
}
