package SoftUniJavaOOP.OOP.Inheritance.Exercise.Hero;

public class Hero {
    String username;
    int level;

    public Hero(){}
    public Hero(String username, int level){
        this.username = username;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s", this.getClass(),this.getUsername(), this.getLevel());
    }
}
