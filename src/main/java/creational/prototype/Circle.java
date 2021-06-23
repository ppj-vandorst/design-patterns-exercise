package creational.prototype;

public class Circle implements Shape {
    private int diameterInPixels;

    public Circle(int diameterInPixels) {
        this.diameterInPixels = diameterInPixels;
    }

    // Getters
    public int getDiameterInPixels() {
        return diameterInPixels;
    }

    // Setters
    public void setDiameterInPixels(int diameterInPixels) {
        this.diameterInPixels = diameterInPixels;
    }

    @Override
    public double calculateCircumference() {
        return this.diameterInPixels * Math.PI;
    }
}
