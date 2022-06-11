package MockExam3;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        if (n < 0) {
            return;
        }

        int odd = 0;
        int even = 0;

        while (n > 0) {
            long lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                even += lastDigit;
            } else {
                odd += lastDigit;
            }
            n /= 10;
        }

        if (even > odd) {
            System.out.printf("%d energy drinks", even);
        } else if (odd > even) {
            System.out.printf("%d cups of coffee", odd);
        } else {
            System.out.printf("%d of both", even);
        }
    }
}
