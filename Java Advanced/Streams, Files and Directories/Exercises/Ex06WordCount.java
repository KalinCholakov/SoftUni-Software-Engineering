package streamsFilesAndDirectories.exercises;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06WordCount {
    public static void main(String[] args) throws IOException {

        Scanner word = new Scanner(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"));

        String[] wordsToSearch = word.nextLine().split("\\s+");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String s : wordsToSearch) {
            wordCount.put(s, 0);
        }

        Scanner fileScanner = new Scanner(new FileReader("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));

        String oneWord = fileScanner.next();

        while (fileScanner.hasNext()) {

            if (wordCount.containsKey(oneWord)) {
                int count = wordCount.get(oneWord);
                count++;
                wordCount.put(oneWord, count);
            }

            oneWord = fileScanner.next();
        }

        word.close();
        fileScanner.close();

        PrintWriter printWriter = new PrintWriter("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/results.txt");

        for (Map.Entry<String, Integer> e : wordCount.entrySet()) {
            printWriter.print(String.format("%s - %d%n", e.getKey(), e.getValue()));
        }

        printWriter.close();
    }
}
