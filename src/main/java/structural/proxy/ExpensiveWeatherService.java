package structural.proxy;

public class ExpensiveWeatherService implements WeatherService {

    @Override
    public String getTomorrowsWeatherPrediction(String city) {
        var chance = Math.random() * 100;

        if (city.equals("Rotterdam")) {
            return "Sunny with a " + chance + "% chance of rain";
        } else if (city.equals("Amsterdam")) {
            return "Rainy with a " + chance + "% chance of sun";
        } else {
            return "No data";
        }
    }
}
