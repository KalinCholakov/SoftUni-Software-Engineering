package streamsFilesAndDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex05LineNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");

        String line = bufferedReader.readLine();

        int count = 1;

        while (line != null) {

            printWriter.print(String.format("%d. %s%n", count, line));
            count++;

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        printWriter.close();

    }
}
