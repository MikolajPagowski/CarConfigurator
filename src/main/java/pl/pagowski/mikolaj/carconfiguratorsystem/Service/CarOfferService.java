package pl.pagowski.mikolaj.carconfiguratorsystem.Service;

import pl.pagowski.mikolaj.carconfiguratorsystem.Car.Car;

public interface CarOfferService {

    void prepareAndSendOffer(Car car, String email);
}
