package setsAndMapsAdvanced.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();

        Set<String> VIP = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!guest.equals("PARTY")) {

            if (Character.isDigit(guest.charAt(0))) {
                VIP.add(guest);
            } else {
                regular.add(guest);
            }

            guest = scanner.nextLine();
        }

        while (!guest.equals("END")) {

            if (Character.isDigit(guest.charAt(0))) {
                VIP.remove(guest);
            } else {
                regular.remove(guest);
            }

            guest = scanner.nextLine();
        }

        System.out.println(regular.size() + VIP.size());

        for (String s : VIP) {
            System.out.println(s);
        }

        for (String s : regular) {
            System.out.println(s);
        }
    }
}
