package streamsFilesAndDirectories.exercises;

import java.io.File;
import java.util.ArrayDeque;

public class Ex08GetFolderSize {
    public static void main(String[] args) {

        File folder = new File("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumBytes = 0;

        while (!directories.isEmpty()) {

            File current = directories.poll();
            File[] files = current.listFiles();

            assert files != null;
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumBytes += file.length();
                }
            }
        }

        System.out.println("Folder size: " + sumBytes);
    }
}
