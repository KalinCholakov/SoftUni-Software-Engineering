package streamsFilesAndDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));

        String line = bufferedReader.readLine();

        int sum = 0;

        while (line != null) {

            char[] charactersFromLine = line.toCharArray();
            for (char c : charactersFromLine) {
                sum += c;
            }

            line = bufferedReader.readLine();
        }

        System.out.println(sum);
        bufferedReader.close();
    }
}
