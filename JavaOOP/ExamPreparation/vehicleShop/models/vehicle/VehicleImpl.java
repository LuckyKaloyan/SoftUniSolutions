package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.vehicle;

import SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.common.ExceptionMessages;

public class VehicleImpl implements Vehicle{
    private String name;
    private int strengthRequired;

    public VehicleImpl(String name, int strengthRequired){
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_NAME_NULL_OR_EMPTY);
        }
        if(strengthRequired<0){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_STRENGTH_LESS_THAN_ZERO);
        }
        this.name = name;
        this.strengthRequired = strengthRequired;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrengthRequired() {
        return strengthRequired;
    }

    @Override
    public void making() {
        this.strengthRequired = strengthRequired-5;
    if(this.strengthRequired<0){
        this.strengthRequired =0;
    }
    }

    public boolean reached(){
        return strengthRequired == 0;
    }

}
