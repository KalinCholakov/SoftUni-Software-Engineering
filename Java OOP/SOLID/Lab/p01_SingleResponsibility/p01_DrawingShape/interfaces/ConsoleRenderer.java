package solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces;

public class ConsoleRenderer implements Renderer {
    @Override
    public void render(Shape shape) {
        System.out.println("Shape with area " + shape.getArea());
    }
}
