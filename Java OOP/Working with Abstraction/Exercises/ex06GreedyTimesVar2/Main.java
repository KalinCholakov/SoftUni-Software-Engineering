package workingWithAbstraction.exercises.ex06GreedyTimesVar2;

import workingWithAbstraction.exercises.ex06GreedyTimesVar2.money.Cash;
import workingWithAbstraction.exercises.ex06GreedyTimesVar2.money.Gem;
import workingWithAbstraction.exercises.ex06GreedyTimesVar2.money.Gold;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] save = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(input);

        for (int i = 0; i < save.length; i += 2) {
            String name = save[i];
            long money = Long.parseLong(save[i + 1]);


            if (name.length() == 3) {
                bag.addCash(new Cash(name, money));
            } else if (name.toLowerCase().endsWith("gem")) {
                bag.addGems(new Gem(name, money));
            } else if (name.equalsIgnoreCase("gold")) {
                bag.addGold(new Gold(money));
            }

        }

        System.out.print(bag);
    }
}
