package Methods;

import java.util.Scanner;

public class Problem07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, repeatCount));
    }

    public static String repeatString(String input, int repeatCount) {
        String result = "";
        for (int i = 1; i <= repeatCount; i++) {
            result += input;
        }

        return result;
    }
}
