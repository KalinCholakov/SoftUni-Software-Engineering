package implementations;

import interfaces.Solvable;

public class BalancedParentheses implements Solvable {
    private String parentheses;

    public BalancedParentheses(String parentheses) {
        this.parentheses = parentheses;
    }

    @Override
    public Boolean solve() {
        boolean isBalanced = true;
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char currentBracket = parentheses.charAt(i);
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
            return true;
        } else {
            return false;
        }
    }
}
