package definingClasses.exercises.ex06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Tournament")) {

            String[] data = line.split("\\s+");

            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Trainer trainer = new Trainer(trainerName);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainers.putIfAbsent(trainerName, trainer);

            trainers.get(trainerName).addPokemon(pokemon);

            line = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String element = command;

            for (Trainer trainer : trainers.values()) {
                if (trainer.hasElementType(element)) {
                    trainer.incrementBadges(1);
                } else {
                    trainer.damagePokemons(10);
                }
            }

            command = scanner.nextLine();
        }

        trainers.entrySet().stream()
                .sorted((first, second) -> second.getValue().getNumberOfBadges() - first.getValue().getNumberOfBadges())
                .forEach(stringTrainerEntry -> System.out.println(stringTrainerEntry.getValue().toString()));
    }
}
