package SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team;

public class Germany extends BaseTeam{

    private String name;
    private String country;
    private int advantage;

    public Germany(String name, String country, int advantage){
        super(name,country,advantage);
    }
    @Override
    public void play(){
        advantage=getAdvantage()+145;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
