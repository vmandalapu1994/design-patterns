package com.design_pattern.observer.implementation1;

import java.util.HashSet;
import java.util.Set;

public class Weather implements Observable {


    private int temp;

    private int humidity;

    private int pressure;

    private Set<Observer> observers = new HashSet<>();


    public void updateWeather(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temp, humidity, pressure);
        });
    }

}
