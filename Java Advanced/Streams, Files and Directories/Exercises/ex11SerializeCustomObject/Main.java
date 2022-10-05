package streamsFilesAndDirectories.exercises.ex11SerializeCustomObject;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Course course = new Course();
        course.name = "Java Advanced 2022";
        course.numberOfStudents = 250;

        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/courses.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/courses.ser"));

        objectOutputStream.writeObject(course); //serialize -> write to file

        Course courseFromFile = (Course) objectInputStream.readObject(); //deserialize -> read from file

        System.out.println(courseFromFile.name);
        System.out.println(courseFromFile.numberOfStudents);
    }
}
