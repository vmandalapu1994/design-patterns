package com.design_pattern.mediator;

public class Driver {

    public static void main(String[] args) {
        ATCMediator atcMediator = new ATCMediator();
        PassengerFlight passengerFlight = new PassengerFlight("PassengerFlight", atcMediator);
        CargoFlight cargoFlight = new CargoFlight("CargoFlight", atcMediator);
        Thread thread1 = new Thread(() -> {
            passengerFlight.requestLanding();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            passengerFlight.requestLanding();
        });
        Thread thread2 = new Thread(() -> {
            cargoFlight.requestLanding();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            cargoFlight.requestLanding();
        });
        thread1.start();
        thread2.start();
    }

}
