package creational.prototype;

public class Rectangle implements Shape {
    private int widthInPixels;
    private int heightInPixels;

    public Rectangle(int widthInPixels, int heightInPixels) {
        this.widthInPixels = widthInPixels;
        this.heightInPixels = heightInPixels;
    }

    // Getters
    public int getWidthInPixels() {
        return widthInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    // Setters
    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }

    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    @Override
    public double calculateCircumference() {
        return (this.heightInPixels + this.widthInPixels) * 2;
    }
}
