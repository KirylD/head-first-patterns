package by.developer.impl;

import by.developer.Display;
import by.developer.api.Observer;
import by.developer.api.Subject;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author kiryl.drabysheuski
 * @since 31.07.2018
 */
public class StaticticDisplay implements Observer, Display {

    public static final Logger log = LogManager.getLogger(StaticticDisplay.class);

    private Subject weatherData;

    @Getter @Setter
    private float temperature;
    @Getter @Setter
    private float pressure;

    public StaticticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            temperature = ((WeatherData) subject).getTemperature();
            pressure = ((WeatherData) subject).getPressure();
            display();
        }
        
    }

    @Override
    public void display() {
        log.info("Temperature is {}. Pressure is {}.", temperature, pressure);
    }
}
