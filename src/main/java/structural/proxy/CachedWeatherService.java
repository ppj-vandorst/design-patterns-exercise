package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedWeatherService implements WeatherService {
    private WeatherService realService;

    public CachedWeatherService(WeatherService service) {
        this.realService = service;
    }

    private Map<String, String> predictions = new HashMap<>();

    @Override
    public String getTomorrowsWeatherPrediction(String city) {
        if (predictions.get(city) != null) {
            return predictions.get(city);
        } else {
            var weatherPrediction = this.realService.getTomorrowsWeatherPrediction(city);
            predictions.put(city, weatherPrediction);
            return weatherPrediction;
        }
    }
}
