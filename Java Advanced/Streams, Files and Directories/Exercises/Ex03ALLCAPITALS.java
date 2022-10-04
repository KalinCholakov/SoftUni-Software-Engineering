package streamsFilesAndDirectories.exercises;

import java.io.*;

public class Ex03ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(new FileWriter("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"));

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));

        bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));

        bufferedReader.close();
        printWriter.close();
    }
}
