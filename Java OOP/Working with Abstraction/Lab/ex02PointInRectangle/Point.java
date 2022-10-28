package workingWithAbstraction.lab.ex02PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterOrEqualThan(Point point) {
        return x >= point.x && y >= point.y;
    }

    public boolean isLessOrEqualThan(Point point) {
        return x <= point.x && y <= point.y;
    }
}
