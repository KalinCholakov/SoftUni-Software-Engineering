package setsAndMapsAdvanced.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Ex08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGraduation = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String name = scanner.nextLine();

            List<Double> grades = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            studentGraduation.putIfAbsent(name, grades);

        }

        studentGraduation.forEach((key, value) -> {
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }

            double avg;
            if (value.size() != 0) {
                avg = sum / value.size();
            } else {
                avg = 0;
            }

            DecimalFormat format = new DecimalFormat("#.###############");


            System.out.printf("%s is graduated with %s%n", key, format.format(avg));
        });
    }
}
