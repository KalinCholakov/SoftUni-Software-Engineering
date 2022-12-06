package messageTranslator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[a-zA-Z]{8,})]");
        Matcher matcher;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            matcher = pattern.matcher(input);
            if (matcher.find()) {
                String message = matcher.group("message");
                String command = matcher.group("command");

                StringBuilder builder = new StringBuilder();
                char[] chars = message.toCharArray();
                for (char c : chars) {
                    builder.append((int) c)
                            .append(" ");
                }
                System.out.println(command + ": " + builder);


            } else {
                System.out.println("The message is invalid!");
            }
        }
    }
}
