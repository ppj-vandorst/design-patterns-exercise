package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    public void itShouldCreateAServiceUsingTheSingletonPattern() {
        SecretService service1 = SecretService.getInstance();
        SecretService service2 = SecretService.getInstance();
        SecretService service3 = SecretService.getInstance();

        assertThat(service1).isEqualTo(service2);
        assertThat(service1).isEqualTo(service3);
    }
}
