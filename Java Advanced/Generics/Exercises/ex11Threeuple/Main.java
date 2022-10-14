package generics.exercises.ex11Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String name = input[0] + " " + input[1];
        String address = input[2];
        String town = input[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<>(name, address, town);

        input = scanner.nextLine().split(" ");
        String firstName = input[0];
        Integer litersOfBeer = Integer.parseInt(input[1]);
        Boolean drunkOrNot = input[2].equals("drunk");
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<>(firstName, litersOfBeer, drunkOrNot);

        input = scanner.nextLine().split(" ");
        String name1 = input[0];
        Double accountBalance = Double.parseDouble(input[1]);
        String bankName = input[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<>(name1, accountBalance, bankName);

        System.out.println(firstThreeuple);
        System.out.println(secondThreeuple);
        System.out.println(thirdThreeuple);
    }
}
