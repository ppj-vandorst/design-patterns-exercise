package structural.adapter;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {

    @Test
    public void itShouldExposeTheMeasurementServiceUsingTheAdapterPattern() {
        MeasurementService measurementService = new MeasurementServiceImpl();
        MetricMeasurementServiceAdapter adapter = new MetricMeasurementServiceAdapterImpl(measurementService);

        assertThat(adapter.calculateRectangleCircumferenceInCm(10, 10)).isEqualTo(40);
        assertThat(adapter.calculateRectangleSurfaceInCm(10, 10)).isCloseTo(100, Offset.offset(0.1));
    }
}
