package streamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01ReadFile {
    public static void main(String[] args) {

        String path = "resources/input.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            int bytes = fileInputStream.read();

            while (bytes != -1) {
                System.out.printf("%s ", Integer.toBinaryString(bytes));

                bytes = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
