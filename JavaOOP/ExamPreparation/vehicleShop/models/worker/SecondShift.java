package SoftUniJavaOOP.ExamPreparationOOP.vehicleShop.models.worker;

public class SecondShift extends BaseWorker{


    public SecondShift(String name){
        super(name,70);
    }

    @Override
    public void working() {
        super.working();
        super.secondShiftTiredness(5);
    }

}
