package examPreparation.ex06Openning.bakery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bakery {
    List<Employee> employees;
    String name;
    int capacity;

    public Bakery(String name, int capacity) {
        employees = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Employee employee) {
        if (employees.size() < capacity) {
            employees.add(employee);
        }
    }

    public boolean remove(String name) {
        return employees.removeIf(employee -> employee.getName().equals(name));
    }

    public Employee getOldestEmployee() {
        return Collections.max(employees, Comparator.comparingInt(Employee::getAge));
    }

    public Employee getEmployee(String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("Employees working at Bakery %s:", name));

        for (Employee employee : employees) {
            out.append(System.lineSeparator())
                    .append(employee);
        }
        return out.toString();
    }
}
