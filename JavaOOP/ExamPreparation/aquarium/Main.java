package SoftUniJavaOOP.ExamPreparationOOP.aquarium;

import SoftUniJavaOOP.ExamPreparationOOP.aquarium.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.aquarium.core.EngineImpl;


public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
