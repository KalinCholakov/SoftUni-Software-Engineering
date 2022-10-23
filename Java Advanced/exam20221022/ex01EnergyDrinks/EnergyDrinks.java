package exam20221022.ex01EnergyDrinks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> caffeinеStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(caffeinеStack::push);

        ArrayDeque<Integer> energyDrinksQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int maxCaffeine = 0;

        while (!caffeinеStack.isEmpty() && !energyDrinksQueue.isEmpty()) {
            int currentCaffeine = caffeinеStack.peek();
            int currentEnergyDrink = energyDrinksQueue.peek();
            int currentSum = currentCaffeine * currentEnergyDrink;

            if ((currentSum + maxCaffeine) <= 300) {
                maxCaffeine += currentSum;
                caffeinеStack.pop();
                energyDrinksQueue.poll();
            } else {
                caffeinеStack.pop();
                energyDrinksQueue.poll();
                energyDrinksQueue.offer(currentEnergyDrink);
                if (maxCaffeine < 30) {
                    continue;
                }
                maxCaffeine -= 30;
            }
        }

        if (energyDrinksQueue.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            StringBuilder stringBuilder = new StringBuilder("Drinks left: ");
            for (Integer integer : energyDrinksQueue) {
                stringBuilder.append(integer)
                        .append(", ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() -1);
            stringBuilder.deleteCharAt(stringBuilder.length() -1);
            System.out.println(stringBuilder.toString());
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", maxCaffeine);
    }
}
