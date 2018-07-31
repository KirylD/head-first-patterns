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
public class ForecastDisplay implements Observer, Display {

    public static final Logger log = LogManager.getLogger(ForecastDisplay.class);

    private Subject weatherData;

    @Getter @Setter
    private float temperature;
    @Getter @Setter
    private float humidity;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            temperature = ((WeatherData) subject).getTemperature();
            humidity = ((WeatherData) subject).getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        log.info("Temperature is {}. Humidity is {}.", temperature, humidity);
    }
}
