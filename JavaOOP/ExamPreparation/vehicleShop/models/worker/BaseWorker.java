package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.tool.Tool;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseWorker implements Worker{

    private String name;
    private int strength;
    private Collection<Tool> tools;

    public BaseWorker(String name, int strength){
        if(name == null || name.equals("")){
throw new IllegalArgumentException(ExceptionMessages.WORKER_NAME_NULL_OR_EMPTY);
        }
        if(strength<0){
            throw new IllegalArgumentException(ExceptionMessages.WORKER_STRENGTH_LESS_THAN_ZERO);
        }

        tools = new ArrayList<>();
        this.name = name;
        this.strength = strength;
    }

    public void working(){
        this.strength = this.strength-10;
        if(this.strength<0){
            this.strength = 0;
        }
    }

    public void addTool(Tool tool){
      tools.add(tool);
    }
    public boolean canWork(){
        if(strength>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public Collection<Tool> getTools() {
        return tools;
    }
    protected void secondShiftTiredness(int value){
        this.strength = this.strength-value;
    }
}
