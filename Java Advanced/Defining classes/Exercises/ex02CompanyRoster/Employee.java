package definingClasses.exercises.ex02CompanyRoster;

public class Employee {
    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;

    public Double getSalary() {
        return salary;
    }

    private int age;

    public Employee(String name, Double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, Double salary, String position, String department) {
        this(name, salary, position, department, "n/a", Integer.parseInt("-1"));
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department, email, Integer.parseInt("-1"));
    }

    public Employee(String name, Double salary, String position, String department, int age) {
        this(name, salary, position, department, "n/a", age);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", name, salary, email, age);
    }
}
