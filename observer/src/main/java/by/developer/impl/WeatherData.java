package by.developer.impl;

import by.developer.api.Observer;
import by.developer.api.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private boolean changed;

    @Getter @Setter
    private float temperature;
    @Getter @Setter
    private float pressure;
    @Getter @Setter
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer : observers) {
                observer.update(this);
            }
            changed = false;
        }
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    private void measurementsChanged() {
        if (temperature > 10) {
            setChanged();
        }
        notifyObservers();
    }

    @Override
    public void setChanged() {
        changed = true;
    }

}
