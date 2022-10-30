package workingWithAbstraction.exercises.ex03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RankPower rankOfTheCard = RankPower.valueOf(scanner.nextLine());
        SuitPower suitOfTheCard = SuitPower.valueOf(scanner.nextLine());

        int cardPower = rankOfTheCard.getPower() + suitOfTheCard.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rankOfTheCard, suitOfTheCard, cardPower);
    }
}
