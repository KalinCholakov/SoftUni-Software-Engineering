package Exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Demo
    extends GregorianCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        //String sourceMetric = scanner.next().toLowerCase();
        //String destinationMetric = scanner.next().toLowerCase();

        //char ch = scanner.next().charAt(0);
        char symbol = 'a';
        System.out.printf("This is symbol: %c%n", symbol);

        symbol = 98;
        System.out.printf("This is symbol: %c%n", symbol);
        symbol = 249;
        System.out.printf("This is symbol: %c%n", symbol);
        String text = "Hello, Telerik Academy!";
        symbol = text.charAt(0);
        System.out.printf("This is symbol: %c%n", symbol);

        // Takes the whole line from the console as text (for example "123")
        String numberAsText = scanner.nextLine();

        // Transforms or parses the text "123" into the number 123
        int number = Integer.parseInt(numberAsText);

        number = number - 1; //123 - 1 = 122

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Print the sum of all numbers
        System.out.println(a + b + c);

        /*int a = 15;
        System.out.println(a / 2.0);
        System.out.println(a / 0.0);     // Резултат: Infinity
        System.out.println(-a / 0.0);    // Резултат: -Infinity
        System.out.println(0.0 / 0.0);*/


    }
}