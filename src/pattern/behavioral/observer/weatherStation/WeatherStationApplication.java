/**
 * Original: https://ru.wikipedia.org/wiki/
 */
package pattern.behavioral.observer.weatherStation;

public class WeatherStationApplication {
    public WeatherStationApplication() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
