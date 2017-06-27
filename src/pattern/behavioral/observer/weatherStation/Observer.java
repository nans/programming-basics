/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.observer.weatherStation;

public interface Observer {
    void update (float temperature, float humidity, int pressure);
}
