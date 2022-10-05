package streamsFilesAndDirectories.exercises.ex10SerializeArrayList;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Double> list = new ArrayList<>();

        list.add(3.5);
        list.add(6.5);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/lists.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/lists.ser"));

        objectOutputStream.writeObject(list);

        ArrayList listFromFile = (ArrayList) objectInputStream.readObject();

        for (Object o : listFromFile) {
            System.out.print(o + " ");
        }
    }
}
