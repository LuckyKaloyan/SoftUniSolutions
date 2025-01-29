package SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team;

import SoftUniJavaOOP.ExamPreparationOOP.handball.common.ExceptionMessages;


public abstract class BaseTeam implements Team{
    private String name;
    private String country;
    private int advantage;

    public BaseTeam(String name, String country, int advantage){
        if(name==null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.TEAM_NAME_NULL_OR_EMPTY);
        }
        if(country==null || country.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.TEAM_COUNTRY_NULL_OR_EMPTY);
        }
        if(advantage<=0){ throw new NullPointerException(ExceptionMessages.TEAM_ADVANTAGE_BELOW_OR_EQUAL_ZERO);}

        this.name = name;
        this.country = country;
        this.advantage = advantage;
    }
    @Override
    public void play(){}
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAdvantage() {
        return advantage;
    }

}
