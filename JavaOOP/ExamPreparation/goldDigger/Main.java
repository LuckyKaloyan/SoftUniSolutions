package SoftUniJavaOOP.ExamPreparationOOP.goldDigger;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.core.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.core.ControllerImpl;
import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
