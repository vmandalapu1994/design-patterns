package com.design_pattern.mediator;

public class CargoFlight extends Flight {

    private String name;

    public CargoFlight(String name, AirTrafficControl airTrafficControl) {
        super(airTrafficControl);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
