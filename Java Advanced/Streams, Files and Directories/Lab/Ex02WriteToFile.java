package streamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class Ex02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int bytes = fileInputStream.read();

        Set<Character> punctuationSet = Set.of(',', '.', '!', '?');

        while (bytes != -1) {

            char symbol = (char) bytes;

            boolean isPunctuation = punctuationSet.contains(symbol);

            if (!isPunctuation) {
                fileOutputStream.write(symbol);
            }

            bytes = fileInputStream.read();
        }
    }
}
