package stacksAndQueues.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isBalanced = true;
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                openingBrackets.push(currentBracket);
            } else {
                if (openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpenBracket = openingBrackets.pop();
                if (currentBracket == ')' && lastOpenBracket != '(') {
                    isBalanced = false;
                    break;
                } else if (currentBracket == ']' && lastOpenBracket != '[') {
                    isBalanced = false;
                    break;
                } else if (currentBracket == '}' && lastOpenBracket != '{') {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && openingBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
