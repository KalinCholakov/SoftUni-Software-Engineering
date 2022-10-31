package encapsulation.exercises.ex01ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        ensureInputParameter(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        ensureInputParameter(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        ensureInputParameter(height, "Height");
        this.height = height;
    }

    private void ensureInputParameter(double parameter, String messagePrefix) {
        if (parameter <= 0) {
            throw new IllegalArgumentException(messagePrefix + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        //2lw + 2lh + 2wh
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        //2lh + 2wh
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        //lwh
        return length * width * height;
    }
}
