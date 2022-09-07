package com.company;


import java.util.Arrays;
import java.util.Scanner;
public class Problem7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        while (numbersArr.length > 1) {
            int[] condensed = new int[numbersArr.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbersArr[i] + numbersArr[i + 1];

            }
            numbersArr = condensed;
        }
        System.out.println(numbersArr[0]);
    }
}
