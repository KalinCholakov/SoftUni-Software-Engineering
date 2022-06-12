package MockExam3;

import java.util.Arrays;
import java.util.Scanner;

public class AloneNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(", ");
        int[] arr1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr1[i] = Integer.parseInt(array[i]);
        }

        int target = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != target) {
                arr2[i] = arr1[i];
            } else if (arr1[i] == target && i != 0 && i != arr1.length - 1) {
                arr2[i] = Math.max(arr1[i - 1], arr1[i + 1]);
            } else {
                arr2[i] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
