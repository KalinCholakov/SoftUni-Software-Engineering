package definingClasses.exercises.ex07Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personData = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            String personName = data[0];

            personData.putIfAbsent(personName, new Person());

            switch (data[1]) {
                case "company":
                    String companyName = data[2];
                    String department = data[3];
                    double salary = Double.parseDouble(data[4]);
                    Company company = new Company(companyName, department, salary);
                    personData.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType = data[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personData.get(personName).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = data[2];
                    String parentBirthday = data[3];
                    Parents parents = new Parents(parentName, parentBirthday);
                    personData.get(personName).getParents().add(parents);
                    break;
                case "children":
                    String childName = data[2];
                    String childBirthday = data[3];
                    Children children = new Children(childName, childBirthday);
                    personData.get(personName).getChildren().add(children);
                    break;
                case "car":
                    String carModel = data[2];
                    String carSpeed = data[3];
                    Car car = new Car(carModel, carSpeed);
                    personData.get(personName).setCar(car);
                    break;
            }

            input = scanner.nextLine();
        }

        String searchPerson = scanner.nextLine();

        System.out.println(searchPerson);
        System.out.print(personData.get(searchPerson));
    }
}
