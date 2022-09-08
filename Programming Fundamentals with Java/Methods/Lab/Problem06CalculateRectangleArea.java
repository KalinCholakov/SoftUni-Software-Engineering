package Methods;

import java.util.Scanner;

public class Problem06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double lengthInput = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(widthInput, lengthInput);

        System.out.printf("%.0f", area);
    }

    public static double calculateRectangleArea(double width, double length) {
        return width * length;
    }
}
