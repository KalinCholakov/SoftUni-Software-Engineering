package Methods;

import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;

public class Problem05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        priceOrder(product, quantity);
    }

    public static void priceOrder(String product, int quantity) {
        double totalPrice = 0;
        switch (product) {
            case "coffee":
                totalPrice = quantity * 1.50;
                break;
            case "water":
                totalPrice = quantity * 1.00;
                break;
            case "coke":
                totalPrice = quantity * 1.40;
                break;
            case "snacks":
                totalPrice = quantity * 2.00;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
