package definingClasses.exercises.ex02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public double calculateAverageSalary() {
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }
}
