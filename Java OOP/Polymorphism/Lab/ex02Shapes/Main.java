package polymorphism.lab.ex02Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2D, 3D);
        Shape circle = new Circle(3D);

        printShape(rectangle);
        printShape(circle);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
