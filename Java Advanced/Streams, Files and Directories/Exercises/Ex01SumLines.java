package streamsFilesAndDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex01SumLines {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));

        String line = bufferedReader.readLine();

        while (line != null) {

            int sum = 0;
            char[] charactersFromLine = line.toCharArray();
            for (char c : charactersFromLine) {
                sum += c;
            }

            System.out.println(sum);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
