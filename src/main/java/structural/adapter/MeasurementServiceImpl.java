package structural.adapter;

public class MeasurementServiceImpl implements MeasurementService {

    public double calculateRectangleCircumferenceInInches(double widthInInches, double heightInInches) {
        return (widthInInches + heightInInches) * 2;
    }

    public double calculateRectangleSurfaceInInches(double widthInInches, double heightInInches) {
        return widthInInches * heightInInches;
    }
}
