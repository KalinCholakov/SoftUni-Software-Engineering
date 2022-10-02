package streamsFilesAndDirectories.lab;

import java.io.*;

public class Ex05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        FileOutputStream fileOutputStream = new FileOutputStream("every third line.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        String line = bufferedReader.readLine();

        int lineCounter = 1;

        while (line != null) {
            if (lineCounter % 3 == 0) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            line = bufferedReader.readLine();
            lineCounter++;
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
