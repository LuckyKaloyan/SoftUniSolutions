package SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magicians;

import SoftUniJavaOOP.ExamPreparationOOP.magicGame.models.magics.Magic;

public class Wizard extends MagicianImpl{

    public Wizard(String username, int health, int protection, Magic magic){
        super(username, health, protection, magic);
    }
}
