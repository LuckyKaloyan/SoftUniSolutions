package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Tournament")) {
            String[] parts = command.split("\\s+");
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String pokemonElement = parts[2];
            int pokemonHealth = Integer.parseInt(parts[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = trainers.computeIfAbsent(trainerName, Trainer::new);
            trainer.addPokemon(pokemon);

            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("End")) {
            String element = command;

            for (Trainer trainer : trainers.values()) {
                if (trainer.hasPokemonOfElement(element)) {
                    trainer.increaseBadges();
                } else {
                    trainer.getPokemons().forEach(pokemon -> pokemon.decreaseHealth(10));
                    trainer.removeDeadPokemons();
                }
            }

            command = scanner.nextLine();
        }

        trainers.values().stream()
                .sorted(Comparator.comparingInt(Trainer::getBadges).reversed())
                .forEach(trainer -> {
                    System.out.printf("%s %d %d%n", trainer.getName(), trainer.getBadges(), trainer.getPokemons().size());
                });
    }
}