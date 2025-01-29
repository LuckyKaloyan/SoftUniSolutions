package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.tool;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.common.ExceptionMessages;

public class ToolImpl implements Tool{

    private int power;

    public ToolImpl(int power){
    if(power<0){
        throw new IllegalArgumentException(ExceptionMessages.TOOL_POWER_LESS_THAN_ZERO);
    }
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void decreasesPower() {
        this.power = this.power - 5;
        if(this.power<0){
            this.power = 0;
        }
    }
    public boolean isUnfit(){
        if(this.power==0){
            return true;
        }else {
            return false;
        }
    }

}
