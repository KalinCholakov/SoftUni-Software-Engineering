package examPreparation.ex07PhoneShop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String phone = tokens[1];

            switch (command) {
                case "Add":
                    if (!data.contains(phone)) {
                        data.add(phone);
                    }
                    break;
                case "Remove":
                    data.removeIf(p -> p.equals(phone));
                    break;
                case "Bonus phone":
                    String[] oldPhoneNewPhone = phone.split(":");
                    String oldPhone = oldPhoneNewPhone[0];
                    String newPhone = oldPhoneNewPhone[1];
                    int indexOfOldPhone = data.indexOf(oldPhone);
                    if (data.contains(oldPhone)) {
                        data.add(indexOfOldPhone + 1, newPhone);
                    }
                    break;
                case "Last":
                    if (data.contains(phone)) {
                        data.remove(phone);
                        data.add(phone);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", data));
    }
}
