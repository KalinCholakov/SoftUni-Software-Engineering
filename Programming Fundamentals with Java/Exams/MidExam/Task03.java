package MidExamJavaFundSoftuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> output = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "Chat":
                    String chatMessage = parts[1];
                    output.add(chatMessage);
                    break;
                case "Delete":
                    String deleteMessage = parts[1];
                    for (int i = 0; i < output.size(); i++) {
                        if (output.get(i).equals(deleteMessage)) {
                            output.remove(i);
                        }
                    }
                    break;
                case "Edit":
                    String message = parts[1];
                    String editedVersion = parts[2];
                    for (int i = 0; i < output.size(); i++) {
                        if (output.get(i).equals(message)) {
                            output.set(i, editedVersion);
                        }
                    }
                    break;
                case "Pin":
                    String pinMessage = parts[1];
                    for (int i = 0; i < output.size(); i++) {
                        if (output.get(i).equals(pinMessage)) {
                            output.add(output.get(i));
                            output.remove(i);
                        }
                    }
                    break;
                case "Spam":
                    String messages = "";
                    for (int i = 1; i < parts.length; i++) {
                        output.add(parts[i]);
                    }

                    break;
            }
            command = scanner.nextLine();
        }

        for (String chat : output) {
            System.out.println(chat);
        }
    }
}
