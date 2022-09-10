package Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Students2.Student.getStudent;
import static Students2.Student.isStudentExisting;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }
            line = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(searchTown)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }
}
