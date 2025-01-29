package SoftUniJavaOOP.ExamPreparationOOP.handball;

import SoftUniJavaOOP.ExamPreparationOOP.handball.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.handball.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
