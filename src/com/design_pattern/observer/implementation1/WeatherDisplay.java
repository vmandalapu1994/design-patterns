package com.design_pattern.observer.implementation1;

public class WeatherDisplay implements Observer {

    private int temp;

    private int humidity;

    private int pressure;


    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Weather today: temparature: " + temp + "F degrees, humidity: " + humidity + "%" + ", pressure: " + pressure);
    }

}
