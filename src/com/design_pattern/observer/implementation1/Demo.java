package com.design_pattern.observer.implementation1;

public class Demo {

    public static void main(String[] args) {
        Weather weather = new Weather();

        WeatherDisplay weatherDisplay = new WeatherDisplay();
        weather.addObserver(weatherDisplay);

        weather.updateWeather(20, 20, 40);
        weather.updateWeather(21, 21, 40);
    }


}
