package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOperations = Integer.parseInt(scanner.nextLine());
        String text = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < countOperations; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            String command = inputTokens[0];

            switch (command) {
                case "1":
                    stack.push(text);
                    text += inputTokens[1];
                    break;
                case "2":
                    int countSymbolsToRemove = Integer.parseInt(inputTokens[1]);
                    stack.push(text);
                    text = text.substring(0, text.length() - countSymbolsToRemove);
                    break;
                case "3":
                    int index = Integer.parseInt(inputTokens[1]);
                    char result = text.charAt(index - 1);
                    System.out.println(result);
                    break;
                case "4":
                    text = stack.pop();
                    break;
            }
        }
    }
}
