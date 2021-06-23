package creational.prototype;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTest {

    @Test
    public void ItShouldCreateShapesUsingThePrototypePattern() {
        Shape circle = new Circle(100);
        Shape rectangle = new Rectangle(100, 50);

        Shape circleClone = circle.clone();
        Shape rectangleClone = rectangle.clone();

        assertThat(circle.calculateCircumference()).isCloseTo(314.1, Offset.offset(0.1));
        assertThat(rectangle.calculateCircumference()).isEqualTo(300);

        assertThat(circleClone.calculateCircumference()).isCloseTo(314.1, Offset.offset(0.1));
        assertThat(rectangleClone.calculateCircumference()).isEqualTo(300);
    }
}
