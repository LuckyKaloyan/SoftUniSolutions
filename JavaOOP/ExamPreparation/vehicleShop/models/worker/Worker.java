package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.tool.Tool;

import java.util.Collection;

public interface Worker {
    void working();

    void addTool(Tool tool);

    boolean canWork();

    String getName();

    int getStrength();

    Collection<Tool> getTools();
}
