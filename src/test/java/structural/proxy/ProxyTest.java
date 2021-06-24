package structural.proxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    public void itShouldProxyTheExpensiveWeatherService() {
        WeatherService realService = new ExpensiveWeatherService();
        WeatherService proxyService = new CachedWeatherService(realService);

        String prediction1 = proxyService.getTomorrowsWeatherPrediction("Rotterdam");
        String prediction2 = proxyService.getTomorrowsWeatherPrediction("Rotterdam");
        assertThat(prediction1).isEqualTo(prediction2);
    }
}
