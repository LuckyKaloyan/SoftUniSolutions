package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;
import java.util.ArrayList;
import java.util.List;

class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public boolean hasPokemonOfElement(String element) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void increaseBadges() {
        badges++;
    }

    public void removeDeadPokemons() {
        pokemons.removeIf(pokemon -> !pokemon.isAlive());
    }
}
