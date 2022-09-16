package stacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!"Home".equals(command = scanner.nextLine())) {

            if (command.equals("back")) {
                if (browserHistory.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.addFirst(browserHistory.peek());
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            } else if (command.equals("forward")) {
                if (forwardHistory.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardHistory.peek());
                    browserHistory.push(forwardHistory.pop());
                }
            } else {
                System.out.println(command);
                browserHistory.push(command);
                forwardHistory.clear();
            }
        }
    }
}
