package SoftUniJavaOOP.ExamPreparationOOP.robotService.entities.services;

import SoftUniJavaOOP.ExamPreparationOOP.robotService.common.ConstantMessages;
import SoftUniJavaOOP.ExamPreparationOOP.robotService.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.robotService.entities.robot.Robot;
import SoftUniJavaOOP.ExamPreparationOOP.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BaseService implements Service{
    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Robot> robots;


    public BaseService(String name, int capacity){
        setName(name);
        this.capacity = capacity;
        this.supplements = new ArrayList<>();
        this.robots = new ArrayList<>();
    }
    public int sumHardness(){
        int sum = 0;
        for(Supplement supplement:supplements){
            sum = sum+supplement.getHardness();
        }
        return sum;
        }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Robot> getRobots() {
        return robots;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return supplements;
    }

    @Override
    public void addRobot(Robot robot) {
        if(capacity<=robots.size()){
            throw new IllegalStateException(ConstantMessages.NOT_ENOUGH_CAPACITY_FOR_ROBOT);
        }
        robots.add(robot);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        supplements.add(supplement);
    }

    @Override
    public void feeding() {
        for(Robot robot:robots){
            robot.eating();
        }
    }

    @Override
    public String getStatistics() {
        StringBuilder robotsLine = new StringBuilder();

        if(!robots.isEmpty()){
            Iterator<Robot> iterator = robots.iterator();
           while(iterator.hasNext()){
               robotsLine.append(" ").append(iterator.next().getName());
           }
        }else{
            robotsLine.append("none");
        }
        return String.format("%s %s:"+System.lineSeparator()
                +"Robots:"+robotsLine+System.lineSeparator()
                +"Supplements: %d Hardness: %d",name,getClass().getSimpleName(),supplements.size(),sumHardness());
    }

    @Override
    public void removeRobot(Robot robot) {
        robots.remove(robot);

        }
    }
