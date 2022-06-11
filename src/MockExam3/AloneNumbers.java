package MockExam3;

import java.util.Arrays;
import java.util.Scanner;

public class AloneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine()
                        .split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                arr2[0] = arr1[0];
            } else if (i == arr1.length - 1) {
                arr2[arr2.length - 1] = arr1[arr1.length - 1];
            } else {
                if (arr1[i] == target && arr1[i] != arr1[i - 1] && arr1[i] != arr1[i + 1]) {
                    arr2[i] = Math.max(arr1[i - 1], arr1[i + 1]);
                } else {
                    arr2[i] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
