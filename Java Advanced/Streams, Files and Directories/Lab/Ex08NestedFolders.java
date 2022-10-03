package streamsFilesAndDirectories.lab;

import java.io.File;
import java.util.ArrayDeque;

public class Ex08NestedFolders {
    public static void main(String[] args) {

        String path = "resources/Files-and-Streams";
        File root = new File(path);

        ArrayDeque<File> dirs = new ArrayDeque<>();

        dirs.offer(root);

        int count = 0;
        while (!dirs.isEmpty()) {

            File current = dirs.poll();

            File[] nestedFiles = current.listFiles();

            if (nestedFiles != null) {
                for (File nestedFile : nestedFiles) {
                    if (nestedFile.isDirectory()) {
                        dirs.offer(nestedFile);
                    }
                }
                count++;

                System.out.println(current.getName());
            }
        }

        System.out.println(count + " folders");
    }
}
