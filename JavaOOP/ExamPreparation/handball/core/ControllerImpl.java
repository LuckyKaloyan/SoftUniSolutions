package SoftUniJavaOOP.ExamPreparationOOP.handball.core;

import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.ElbowPad;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.Equipment;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.Kneepad;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.gameplay.Gameplay;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.gameplay.Indoor;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.gameplay.Outdoor;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team.Bulgaria;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team.Germany;
import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.team.Team;
import SoftUniJavaOOP.ExamPreparationOOP.handball.repositories.EquipmentRepository;

import java.util.ArrayList;
import java.util.Collection;

import static SoftUniJavaOOP.ExamPreparationOOP.handball.common.ConstantMessages.SUCCESSFULLY_ADDED_EQUIPMENT_IN_GAMEPLAY;
import static SoftUniJavaOOP.ExamPreparationOOP.handball.common.ExceptionMessages.NO_EQUIPMENT_FOUND;

public  class ControllerImpl implements Controller {
    private EquipmentRepository equipment;
    private Collection<Gameplay> gameplays ;


    public ControllerImpl(){
        this.equipment = new EquipmentRepository();
        this.gameplays = new ArrayList<>();
    }

    @Override
    public String addGameplay(String gameplayType, String gameplayName) {
        if(!gameplayType.equals("Indoor") && !gameplayType.equals("Outdoor")){
            throw new NullPointerException("Invalid gameplay type.");

        }else {
            Gameplay gameplay;
            if(gameplayType.equals("Indoor")) {
                gameplay = new Indoor(gameplayName) {};
            }else{
                gameplay = new Outdoor(gameplayName) {};
            }
            this.gameplays.add(gameplay);
            return String.format("Successfully added %s", gameplayType);
        }
    }
    @Override
    public String addEquipment(String equipmentType){
        if(equipmentType.equals("Kneepad")){
            Kneepad kneepad = new Kneepad();
         equipment.add(kneepad);
            return String.format("Successfully added %s",kneepad.getClass().getSimpleName());
        }else if(equipmentType.equals("ElbowPad")){
              ElbowPad elbowPad = new ElbowPad();
              equipment.add(elbowPad);
            return String.format("Successfully added %s",elbowPad.getClass().getSimpleName());
        }else{
            throw new IllegalArgumentException("Invalid equipment type.");
        }
        }

    @Override
    public String equipmentRequirement(String gameplayName, String equipmentType) {
        Equipment byType = this.equipment.findByType(equipmentType);
        if (byType == null) {
            throw new IllegalArgumentException(String.format(NO_EQUIPMENT_FOUND, equipmentType));
        }
        this.equipment.remove(byType);
        return String.format(SUCCESSFULLY_ADDED_EQUIPMENT_IN_GAMEPLAY, equipmentType, gameplayName);
    }

    public String addTeam(String gameplayName, String teamType, String teamName, String country, int advantage) {
        if (!teamType.equals("Bulgaria") && !teamType.equals("Germany")) {
            throw new IllegalArgumentException("Invalid team type.");
        } else {
            boolean suitableTerrain = false;
            for (Gameplay gameplay : gameplays) {
                if (gameplay.getName().equals(gameplayName)) {
                    suitableTerrain = gameplay instanceof Outdoor;
                    break;
                }
            }
            if (!suitableTerrain) {
                return "The coverage of the terrain is not suitable.";
            }

            Team team;
            if (teamType.equals("Bulgaria")) {
                team = new Bulgaria(teamName, country, advantage);
            } else {
                team = new Germany(teamName, country, advantage);
            }

            for (Gameplay gameplay : gameplays) {
                if (gameplay.getName().equals(gameplayName)) {
                    gameplay.addTeam(team);
                    return String.format("Successfully added %s to %s.", teamType, gameplayName);
                }
            }

            return "Error: Gameplay not found.";
        }
    }


    public String playInGameplay(String gameplayName){
          int playedTeams = 0;
        for(Gameplay gameplay: gameplays){
            if(gameplay.getName().equals(gameplayName)){
                gameplay.teamsInGameplay();
              playedTeams=playedTeams+gameplay.getTeam().size();

            }

        }
        return "Teams that have played: "+playedTeams;
    }

    public String percentAdvantage(String gameplayName){
        int advantageTotal = 0;
        for(Gameplay gameplay: gameplays){
            if(gameplay.getName().equals(gameplayName)){
                for(Team team: gameplay.getTeam()){
                    advantageTotal= advantageTotal + team.getAdvantage();
                }
            }
        }
        return String.format("The advantage of Gameplay %s is %d.",gameplayName,advantageTotal);
    }

    @Override
    public String getStatistics() {
        StringBuilder kek = new StringBuilder();

        for(Gameplay gameplay:gameplays){
            kek.append(gameplay.getName()).append(" ").append(gameplay.getClass().getSimpleName()).append(System.lineSeparator()).append("Team:");
            if(!gameplay.getTeam().isEmpty()) {
            for(Team team:gameplay.getTeam()){
                kek.append(" ").append(team.getName());
                       }
            }else{
                kek.append(" none");
            }
            kek.append("Equipment: ").append(gameplay.getEquipments().size()).append(", Protection: ").append(gameplay.allProtection()).append(System.lineSeparator());
        }
        return kek.toString();
    }
    public void eating(){

    }

}



