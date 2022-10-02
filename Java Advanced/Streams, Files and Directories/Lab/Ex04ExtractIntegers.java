package streamsFilesAndDirectories.lab;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                fileOutputStream.write(String.valueOf(scanner.nextInt()).getBytes());
                fileOutputStream.write(System.lineSeparator().getBytes());
            } else {
                scanner.next();
            }
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
