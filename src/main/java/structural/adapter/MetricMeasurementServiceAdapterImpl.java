package structural.adapter;

public class MetricMeasurementServiceAdapterImpl implements MetricMeasurementServiceAdapter {
    private MeasurementService measurementService;
    private static double MULTIPLIER = 0.393701;

    public MetricMeasurementServiceAdapterImpl(MeasurementService service) {
        this.measurementService = service;
    }

    @Override
    public double calculateRectangleCircumferenceInCm(int widthInCm, int heightInCm) {
        var widthInInches = widthInCm * MULTIPLIER;
        var heightInInches = heightInCm * MULTIPLIER;
        return measurementService.calculateRectangleCircumferenceInInches(widthInInches, heightInInches) / MULTIPLIER;
    }

    @Override
    public double calculateRectangleSurfaceInCm(int widthInCm, int heightInCm) {
        var widthInInches = widthInCm * MULTIPLIER;
        var heightInInches = heightInCm * MULTIPLIER;
        return measurementService.calculateRectangleSurfaceInInches(widthInInches, heightInInches) / MULTIPLIER / MULTIPLIER;
    }
}
