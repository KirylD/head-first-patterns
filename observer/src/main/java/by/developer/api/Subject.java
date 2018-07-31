package by.developer.api;

public interface Subject {

    void registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();

    void setChanged();
}
