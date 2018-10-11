package observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemp;
    private double minTemp;
    private double sumTemp;
    private int count;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        maxTemp = Double.NEGATIVE_INFINITY;
        minTemp = Double.POSITIVE_INFINITY;
        sumTemp = 0;
        count = 0;
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", sumTemp / count, maxTemp, minTemp);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (temperature > maxTemp) maxTemp = temperature;
        if (temperature < minTemp) minTemp = temperature;
        sumTemp += temperature;
        count ++;
        display();
    }
}
