package SoftUniJavaOOP.OOP.Inheritance.Exercise.Hero;

public class Knight extends Hero {
    public Knight() {}

    public Knight(String username, int level) {
        super.username = username;
        super.level = level;
    }
}