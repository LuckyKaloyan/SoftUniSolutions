package SoftUniJavaOOP.ExamPreparationOOP.handball.entities.gameplay;

import SoftUniJavaOOP.ExamPreparationOOP.handball.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.Equipment;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team.Team;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseGameplay implements Gameplay{

    private String name;
    private int capacity;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;

    public BaseGameplay(String name, int capacity){
        if(name==null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.GAMEPLAY_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
        this.capacity = capacity;
        this.equipments = new ArrayList<>();
        this.teams = new ArrayList<>();

    }
   public int allProtection(){
        int allProtection = 0;
    for(Equipment equipment:equipments){
       allProtection= allProtection+ equipment.getProtection();
    }
        return allProtection;
    }
    public void addTeam(Team team){
        teams.add(team);
    }
    public void removeTeam(Team team){
        teams.remove(team);
    }
    public void addEquipment(Equipment equipment){
        equipments.add(equipment);
    }
    public void teamsInGameplay(){
        for(Team team:teams){
            team.play();
        }
    }

    @Override
    public String toString() {
       String TeamLine = "Team:";
      if(teams.size()>0){
          for(Team team:teams){
              TeamLine=TeamLine+" "+team.getName();
          }
      }else{
          TeamLine = "Team: none";
      }
      return String.format("%s %s\n " +
              TeamLine+"\n"+
              "Equipment: %d, Protection: %d",name,getClass().getSimpleName(),equipments.size(),allProtection());
    }

    @Override
    public Collection<Team> getTeam() {
        return teams;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return equipments;
    }
}
