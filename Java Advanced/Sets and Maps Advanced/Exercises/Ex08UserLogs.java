package setsAndMapsAdvanced.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String ip = tokens[0].substring(3);
            String user = tokens[2].substring(5);

            if (!users.containsKey(user)) {
                users.put(user, new LinkedHashMap<>());
            }

            if (!users.get(user).containsKey(ip)) {
                users.get(user).put(ip, 1);
            } else {
                int count = users.get(user).get(ip) + 1;
                users.get(user).put(ip, count);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> stringLinkedHashMapEntry : users.entrySet()) {
            System.out.printf("%s:%n", stringLinkedHashMapEntry.getKey());
            LinkedHashMap<String, Integer> attacks = stringLinkedHashMapEntry.getValue();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> stringIntegerEntry : attacks.entrySet()) {
                sb.append(String.format("%s => %d, ", stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
            }

            String finalOutput = sb.substring(0, sb.length() - 2);
            System.out.println(finalOutput + ".");
        }
    }
}
