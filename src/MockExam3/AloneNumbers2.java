package MockExam3;

import java.util.Arrays;
import java.util.Scanner;

public class AloneNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(", ");
        int[] arr1 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr1[i] = Integer.parseInt(array[i]);
        }

        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < arr1.length - 1; i++) {
            if (arr1[i] == target && arr1[i] != arr1[i - 1] && arr1[i] != arr1[i + 1]) {
                if (arr1[i - 1] > arr1[i + 1]) {
                    arr1[i] = arr1[i - 1];
                } else if (arr1[i - 1] < arr1[i + 1]) {
                    arr1[i] = arr1[i + 1];
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.print(arr1[arr1.length - 1] + "]");
    }
}
