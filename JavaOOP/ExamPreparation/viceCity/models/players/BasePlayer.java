package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.players;

import SoftUniJavaOOP.ExamPreparationOOP.viceCity.common.ExceptionMessages;
import SoftUniJavaOOP.ExamPreparationOOP.viceCity.repositories.interfaces.Repository;
import SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.guns.Gun;

public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;

    protected BasePlayer(String name, int lifePoints) {
        setName(name);
        setLifePoints(lifePoints);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.NAME_NULL);
        }
        this.name = name;
    }

    private void setLifePoints(int lifePoints) {
        if (lifePoints < 0) {
            throw new IllegalArgumentException(ExceptionMessages.PLAYER_LIFE_POINTS_LESS_THAN_ZERO);
        }
        this.lifePoints = lifePoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLifePoints() {
        return lifePoints;
    }

    @Override
    public boolean isAlive() {
        return lifePoints > 0;
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return gunRepository;
    }

    @Override
    public void takeLifePoints(int points) {
        int newLifePoints = lifePoints - points;
        if (newLifePoints < 0) {
            newLifePoints = 0;
        }
        lifePoints = newLifePoints;
    }
}