package SoftUniJavaOOP.ExamPreparationOOP.magicGame.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magicians.Magician;

import java.util.ArrayList;
import java.util.Collection;

public class MagicianRepositoryImpl implements MagicianRepository{

    private Collection<Magician> data;

    public MagicianRepositoryImpl(){
        data = new ArrayList<>();
    }
    public void addMagician(Magician magician){
        if(magician==null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_REPOSITORY);
        }
        data.add(magician);
    }

    public boolean removeMagician(Magician magician){

       if(data.contains(magician)){
           data.remove(magician);
           return true;
       }return false;

    }

    @Override
    public Collection<Magician> getData() {
        return data;
    }

    @Override
    public Magician findByUsername(String name) {

        for(Magician magician : data){
            if(magician.getUsername().equals(name)){
               return magician;
            }
        } return null;
    }
}
