package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magicians;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics.Magic;

public abstract class MagicianImpl implements Magician{

    private String username;
    private int health;
    private int protection;
    private boolean isAlive;
    private Magic magic;

    public MagicianImpl(String username, int health, int protection, Magic magic){
        if(username == null || username.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_NAME);
        }
        if(health<0){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_HEALTH);
        }
        if(protection<0){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGICIAN_PROTECTION);
        }
        if(magic==null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_TYPE);
        }


        this.username = username;
        this.health = health;
        this.protection = protection;
        this.magic = magic;
        if(this.health>0){
            this.isAlive = true;
        }
    }

    public void takeDamage(int points){
        if(protection>0){
            while(protection>0 && points>0){
                this.protection--;
                points--;
            }
        }
        if(points>0){
            while(health>0 && points>0){
                health--;
                points--;
            }
        }

        if(this.health<=0){
            isAlive = false;
        }
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getProtection() {
        return protection;
    }

    @Override
    public Magic getMagic() {
        return magic;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }
}
