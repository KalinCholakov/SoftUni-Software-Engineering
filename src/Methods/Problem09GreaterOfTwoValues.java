package Methods;

import java.util.Scanner;

public class Problem09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        switch (inputType) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(ch1, ch2));
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                System.out.println(getMax(str1, str2));
                break;
        }
    }

    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static char getMax(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        } else {
            return ch2;
        }
    }

    public static String getMax(String str1, String str2) {
        String result;
        if (str1.compareTo(str2) > 0) {
            result = str1;
        } else {
            result = str2;
        }
        return result;
    }
}
