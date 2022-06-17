package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println(df.format(calculate(num1, operator, num2)));
    }

    public static double calculate(int number1, String operator, int number2) {
        double result = 0;
        switch (operator) {
            case "/":
                result = number1 * 1.0 / number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
        }

        return result;
    }
}
