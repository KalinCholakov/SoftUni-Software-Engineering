package streamsFilesAndDirectories.lab;

import java.io.*;
import java.util.Set;

public class Ex03CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int bytes = fileInputStream.read();

        Set<Integer> delimiterSet = Set.of(10, 32);

        while (bytes != -1) {

            boolean isDelimiter = delimiterSet.contains(bytes);

            if (isDelimiter) {
                fileOutputStream.write(bytes);
            } else {
                String digits = String.valueOf(bytes);

                for (int i = 0; i < digits.length(); i++) {
                    fileOutputStream.write(digits.charAt(i));
                }
            }

            bytes = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
