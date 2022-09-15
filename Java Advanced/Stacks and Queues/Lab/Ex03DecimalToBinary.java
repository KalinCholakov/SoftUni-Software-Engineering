package stacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        while (decimal != 0) {
            binary.push(decimal % 2);
            decimal /= 2;
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
