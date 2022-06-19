package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] parts = command.split(" ");
            String typeCommand = parts[0];
            switch (typeCommand) {
                case "exchange":
                    int index = Integer.parseInt(parts[1]);
                    if (isValidIndex(index, numbers.length)) {
                        numbers = exchange(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOdd = parts[1];
                    if (evenOrOdd.equals("even")) {
                        printIndexMaxEvenNumber(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printIndexMaxOddNumber(numbers);
                    }
                    break;
                case "min":
                    String minEvenOrOdd = parts[1];
                    if (minEvenOrOdd.equals("even")) {
                        printIndexMinEvenNumber(numbers);
                    } else if (minEvenOrOdd.equals("odd")) {
                        printIndexMinOddNumber(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(parts[1]);
                    if (!isValidCount(count, numbers.length)) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }
                    String firstEvenOrOdd = parts[2];
                    if (firstEvenOrOdd.equals("even")) {
                        printFirstEven(numbers, count);
                    } else if (firstEvenOrOdd.equals("odd")) {
                        printFirstOdd(numbers, count);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(parts[1]);
                    if (!isValidCount(countLast, numbers.length)) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }
                    String lastEvenOrOdd = parts[2];
                    if (lastEvenOrOdd.equals("even")) {
                        printLastEven(numbers, countLast);
                    } else if (lastEvenOrOdd.equals("odd")) {
                        printLastOdd(numbers, countLast);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");
    }

    private static boolean isValidCount(int count, int length) {
        return count <= length;
    }

    private static void printLastOdd(int[] numbers, int countLast) {
        StringBuilder lastOdd = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 != 0) {
                lastOdd.append(currentNumber);
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = lastOdd.length() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(lastOdd.charAt(i));
            } else {
                System.out.print(lastOdd.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printLastEven(int[] numbers, int countLast) {
        StringBuilder lastEven = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                lastEven.append(currentNumber);
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = lastEven.length() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(lastEven.charAt(i));
            } else {
                System.out.print(lastEven.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstOdd(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 != 0) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i <= output.length() - 1; i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstEven(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i <= output.length() - 1; i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printIndexMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = -1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 != 0 && currentNumber <= minOdd) {
                minOdd = currentNumber;
                indexMinOdd = i;
            }
        }
        if (indexMinOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }
    }

    private static void printIndexMinEvenNumber(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = -1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 && currentNumber <= minEven) {
                minEven = currentNumber;
                indexMinEven = i;
            }
        }
        if (indexMinEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printIndexMaxOddNumber(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = -1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 != 0 && currentNumber >= maxOdd) {
                maxOdd = currentNumber;
                indexMaxOdd = i;
            }
        }
        if (indexMaxOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }
    }

    private static void printIndexMaxEvenNumber(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = -1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 && currentNumber >= maxEven) {
                maxEven = currentNumber;
                indexMaxEven = i;
            }
        }
        if (indexMaxEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }

    private static int[] exchange(int[] numbers, int index) {
        int[] arr1 = new int[index + 1];
        int[] arr2 = new int[numbers.length - index - 1];

        for (int i = 0; i <= index; i++) {
            int current = numbers[i];
            arr1[i] = current;
        }

        for (int i = index + 1; i <= numbers.length - 1; i++) {
            int current = numbers[i];
            arr2[i - index - 1] = current;
        }

        int[] exchangedNumbers = new int[numbers.length];

        for (int i = 0; i <= arr2.length - 1; i++) {
            exchangedNumbers[i] = arr2[i];
        }

        for (int i = arr2.length; i <= exchangedNumbers.length - 1; i++) {
            exchangedNumbers[i] = arr1[i - arr2.length];
        }

        return exchangedNumbers;
    }

    public static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
