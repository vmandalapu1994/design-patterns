package com.design_pattern.mediator;

public class PassengerFlight extends Flight {

    private String name;

    public PassengerFlight(String name, AirTrafficControl airTrafficControl) {
        super(airTrafficControl);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
