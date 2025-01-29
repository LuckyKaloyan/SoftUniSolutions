package SoftUniJavaOOP.ExamPreparationOOP.onlineShop;

import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.core.EngineImpl;
import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.core.interfaces.Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
