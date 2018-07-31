package by.developer;

import by.developer.impl.ForecastDisplay;
import by.developer.impl.StaticticDisplay;
import by.developer.impl.WeatherData;

/**
 * @author kiryl.drabysheuski
 * @since 31.07.2018
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(25f, 10f, 65f);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30f, 15f, 70f);

        StaticticDisplay staticticDisplay = new StaticticDisplay(weatherData);

        weatherData.setMeasurements(35f, 20f, 75f);

    }
}
