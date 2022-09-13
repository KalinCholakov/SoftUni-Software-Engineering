package associativeArrays;

import java.util.*;

public class Ex06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courseUsers = new HashMap<>();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseUsers.containsKey(course)) {
                courseUsers.put(course, new ArrayList<>());
            }
            courseUsers.get(course).add(studentName);

            input = scanner.nextLine();
        }

        courseUsers.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
