package streamsFilesAndDirectories.lab.ex09SerializeCustomObject;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube = new Cube();

        cube.color = "green";
        cube.width = 15.3;
        cube.height = 12.4;
        cube.depth = 3.0;

        String path = "resources/save.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("resources/save.txt"));

        Object o = objectInputStream.readObject();

        System.out.println(o);
    }
}
