/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.observer.weatherStation;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
