package associativeArrays;

import java.util.*;

public class Ex07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentList.containsKey(name)) {
                studentList.put(name, new ArrayList<>());
            }
            studentList.get(name).add(grade);
        }

        Map<String, Double> studentAverageGrade = new HashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentList.entrySet()) {
            String nameStudent = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(nameStudent, averageGrade);
            }
        }

        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (Double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
        

