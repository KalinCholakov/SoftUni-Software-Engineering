package MethodsExercise;

import java.util.Scanner;

public class Problem02VowelsCountVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        //toLowerCase -> "DeSI" -> "desi"
        //toUpperCase -> "desi" -> "DESI"

        //метод, който връща брой на гласните букви (A, a, E, e, I, i , O, o, U, u)
        int countVowels = getVowelsCount(text);
        System.out.println(countVowels);
    }

    private static int getVowelsCount(String text) {
        int count = 0; //брой на гласните букви
        //a, e, i , o, u
        //"Desi".toCharArray() -> ['D', 'e', 's', 'i']
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}