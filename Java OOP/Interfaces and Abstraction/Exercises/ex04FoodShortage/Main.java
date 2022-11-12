package interfacesAndAbstraction.exercises.ex04FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();


        while (numberOfPeople-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            Buyer buyer = null;

            if (data.length == 4) {
                buyer = new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3]);
            } else if (data.length == 3) {
                buyer = new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
            }

            buyerMap.put(data[0], buyer);
        }

        String name = scanner.nextLine();

        while (!"End".equals(name)) {
            Buyer buyer = buyerMap.get(name);

            if (buyer != null) {
                buyer.buyFood();
            }

            name = scanner.nextLine();
        }

        System.out.println(buyerMap.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum());
    }
}
