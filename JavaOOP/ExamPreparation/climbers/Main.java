package SoftUniJavaOOP.ExamPreparationOOP.climbers;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.core.Controller;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.core.ControllerImpl;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.core.Engine;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
