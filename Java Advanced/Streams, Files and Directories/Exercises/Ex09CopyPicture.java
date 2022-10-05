package streamsFilesAndDirectories.exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09CopyPicture {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/IMG_2142 2.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/IMG_2142 2-copy.jpg");

        byte[] buffer = new byte[1024];

        while (fileInputStream.read(buffer) >= 0) {
            fileOutputStream.write(buffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
