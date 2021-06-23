package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedWeatherService implements WeatherService {
    private Map<String, String> predictions = new HashMap<>();

    @Override
    public String getTomorrowsWeatherPrediction(String city) {
        return null;
    }
}
