package SoftUniJavaOOP.OOP.Polymorphism.Lab.Animals;

public abstract class Animal {
     protected String name;
     protected String favouriteFood;

    public Animal(String name, String food) {
        this.name = name;
        this.favouriteFood = food;
    }

    abstract public String explainSelf();

    protected void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
