package MockExam4;

import java.util.Arrays;
import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine()
                        .split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays.stream(scanner.nextLine()
                        .split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr3 = new int[arr1.length];

        if (arr1.length >= 1000 || arr2.length >= 1000) {
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            int temp = 0;
            boolean isEqual = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isEqual = true;
                    if (j == arr2.length - 1) {
                        temp = -1;
                    } else {
                        temp = arr2[j];
                    }
                    continue;
                }
                if (arr2[j] >= temp && isEqual) {
                    temp = arr2[j];
                    break;
                } else if (arr2[j] <= temp && isEqual) {
                    temp = -1;
                    break;
                }
            }
            arr3[i] = temp;
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i != arr3.length - 1) {
                System.out.print(arr3[i] + ",");
            } else {
                System.out.print(arr3[i]);
            }
        }
    }
}
