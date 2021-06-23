package structural.adapter;

public class MeasurementServiceImpl implements MeasurementService {

    public double calculateRectangleCircumferenceInInches(int widthInInches, int heightInInches) {
        return (widthInInches + heightInInches) * 2;
    }

    public double calculateRectangleSurfaceInInches(int widthInInches, int heightInInches) {
        return widthInInches * heightInInches;
    }
}
