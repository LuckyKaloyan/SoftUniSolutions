package SoftUniJavaOOP.JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;



class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
