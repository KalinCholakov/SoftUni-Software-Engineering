package solidLab.p03_LiskovSubstitution.p01_Square;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 13);
        Shape square = new Square(4);

        printShapeArea(rectangle);
        printShapeArea(square);
    }

    private static void printShapeArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}
