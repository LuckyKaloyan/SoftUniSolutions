package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics;

public class BlackMagic extends MagicImpl{


    public BlackMagic(String name, int bulletsCount){
        super(name,bulletsCount);
    }

    @Override
    protected void setBulletsCount(int bulletsCount) {
        super.setBulletsCount(bulletsCount);
    }
    @Override
    public int fire() {
        int totalFired = 0;
        if(getBulletsCount()>0){
            for(int i=0; i<10; i++){
                if(getBulletsCount()>0){
                    totalFired++;
                    setBulletsCount(getBulletsCount()-1);
                }
            }
            return totalFired;
        }else{
            return 0;
        }
    }
}
