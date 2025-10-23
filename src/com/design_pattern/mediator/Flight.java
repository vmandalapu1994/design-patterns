package com.design_pattern.mediator;

public abstract class Flight {

    private AirTrafficControl airTrafficControl;

    protected Flight(AirTrafficControl airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
    }

    void requestLanding() {
        if (airTrafficControl.canLand(this)) {
            land();
        } else {
            System.out.println(getName() + " waiting for clearance");
        }
    }

    void land() {
        System.out.printf("%s is landing%n", getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        this.airTrafficControl.notifyLanding(this);
    }

    abstract String getName();
}
