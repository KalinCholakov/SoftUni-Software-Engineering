package setsAndMapsAdvanced.lab;

import java.util.*;

public class Ex05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentMap = new TreeMap<>();

        while (numberOfStudents-- > 0) {

            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");

            String studentName = inputData[0];
            Double studentGrade = Double.parseDouble(inputData[1]);

            if (!studentMap.containsKey(studentName)) {
                studentMap.put(studentName, new ArrayList<>());
            }
            studentMap.get(studentName).add(studentGrade);
        }

        studentMap.forEach((key, value) -> {
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }
            double avgSum = sum / value.size();

            System.out.print(key + " -> ");
            value.forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", avgSum);
        });
    }
}
