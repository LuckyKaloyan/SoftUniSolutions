package SoftUniJavaOOP.ExamPreparationOOP.magicGame;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.magicGame.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
