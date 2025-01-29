package SoftUniJavaOOP.ExamPreparationOOP.robotService;

import SoftUniJavaOOP.ExamPreparationOOP.robotService.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.robotService.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
