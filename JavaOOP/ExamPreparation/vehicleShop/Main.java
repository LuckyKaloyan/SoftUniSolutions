package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
