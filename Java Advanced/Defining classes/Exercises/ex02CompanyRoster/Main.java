package definingClasses.exercises.ex02CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Department> departmentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            Employee employee = null;
            switch (data.length) {
                case 4:
                    employee = new Employee(data[0],
                            Double.parseDouble(data[1]),
                            data[2],
                            data[3]);
                    break;
                case 5:
                    if (data[4].contains("@")) {
                        employee = new Employee(data[0],
                                Double.parseDouble(data[1]),
                                data[2],
                                data[3],
                                data[4]);
                    } else {
                        employee = new Employee(data[0],
                                Double.parseDouble(data[1]),
                                data[2],
                                data[3],
                                Integer.parseInt(data[4]));
                    }
                    break;
                case 6:
                    employee = new Employee(data[0],
                            Double.parseDouble(data[1]),
                            data[2],
                            data[3],
                            data[4],
                            Integer.parseInt(data[5]));
                    break;
            }
            boolean departmentExists = departmentList
                    .stream()
                    .anyMatch(department -> department.getName().equals(data[3]));

            if (!departmentExists) {
                Department department = new Department(data[3]);
                departmentList.add(department);
            }

            Department currentDepartment = departmentList.stream()
                    .filter(department -> department.getName().equals(data[3]))
                    .findFirst()
                    .get();

            currentDepartment.getEmployeeList().add(employee);
        }

        Department highestPaidDepartment = departmentList.stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployeeList()
                .stream()
                .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);
    }
}
