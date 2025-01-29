package SoftUniJavaOOP.ExamPreparationOOP.bank;

import SoftUniJavaOOP.ExamPreparationOOP.bank.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.bank.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
