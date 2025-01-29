package SoftUniJavaOOP.ExamPreparationOOP.viceCity;

import SoftUniJavaOOP.ExamPreparationOOP.viceCity.core.EngineImpl;
import SoftUniJavaOOP.ExamPreparationOOP.viceCity.core.interfaces.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.viceCity.core.interfaces.Engine;

public class Main {
    public static void main(String[] args) {
        Controller controller = null; // TODO
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
