package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics;

public class RedMagic extends MagicImpl{


    public RedMagic(String name, int bulletsCount){
        super(name,bulletsCount);
    }

    @Override
    protected void setBulletsCount(int bulletsCount) {
        super.setBulletsCount(bulletsCount);
    }
    @Override
    public int fire() {
        if(getBulletsCount()>0){
            setBulletsCount(getBulletsCount()-1);
            return 1;
        }else{
            return 0;
        }
    }
}
