package com.design_pattern.mediator;

public interface AirTrafficControl {

    void registerFlight(Flight flight);

    boolean canLand(Flight flight);

    void notifyLanding(Flight flight);

}
