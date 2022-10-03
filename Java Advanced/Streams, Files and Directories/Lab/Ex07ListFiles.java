package streamsFilesAndDirectories.lab;

import java.io.File;

public class Ex07ListFiles {
    public static void main(String[] args) {

        File file = new File("resources/Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (File file1 : files) {
                    if (!file1.isDirectory()) {
                        System.out.printf("%s: [%s]%n", file1.getName(), file1.length());
                    }
                }
            }
        }
    }
}
