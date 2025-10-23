package com.design_pattern.mediator;

public class ATCMediator implements AirTrafficControl {

    private boolean isRunwayFree = true;

    @Override
    public void registerFlight(Flight flight) {

    }

    @Override
    public boolean canLand(Flight flight) {
        if (isRunwayFree) {
            isRunwayFree = false;
            return true;
        }
        return false;
    }

    @Override
    public void notifyLanding(Flight flight) {
        isRunwayFree = true;
    }
}
