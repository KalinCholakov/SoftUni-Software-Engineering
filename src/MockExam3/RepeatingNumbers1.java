package MockExam3;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(array);
        int temp = array[0];
        int counter = 1;
        int counterMax = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                counter++;
                if (counter > counterMax) {
                    counterMax = counter;
                    temp = array[i];
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(temp);
    }
}
