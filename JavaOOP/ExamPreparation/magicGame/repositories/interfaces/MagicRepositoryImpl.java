package SoftUniJavaOOP.ExamPreparationOOP.magicGame.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics.Magic;

import java.util.ArrayList;
import java.util.Collection;

public class MagicRepositoryImpl implements MagicRepository{

    private Collection<Magic> data;

    public MagicRepositoryImpl(){
        this.data = new ArrayList<>();
    }

    public void addMagic(Magic magic){
        if(magic==null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC);
        }
        data.add(magic);
    }
    public boolean removeMagic(Magic magic){
        if(data.contains(magic)){
            data.remove(magic);
            return true;
        }return false;
    }

    @Override
    public Collection<Magic> getData() {
        return data;
    }

    @Override
    public Magic findByName(String name) {
        for(Magic magic:data){
            if(magic.getName().equals(name)){
                return magic;
            }
        }return null;
    }

}
