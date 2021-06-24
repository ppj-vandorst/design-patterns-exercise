package structural.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @Test
    public void itShouldBuildAFormatterUsingTheDecoratorPattern() {
        Formatter decoratedFormatter = new UnderscoreFormatter(new UpperCaseFormatter(new FormatterImpl()));

        assertThat(decoratedFormatter.formatString("test 123 456")).isEqualTo("TEST_123_456");
    }
}
