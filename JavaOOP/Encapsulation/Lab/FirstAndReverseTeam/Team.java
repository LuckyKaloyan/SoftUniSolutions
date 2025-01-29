package SoftUniJavaOOP.OOP.Encapsulation.Lab.FirstAndReverseTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam = new ArrayList<>();
    private List<Person> reserveTeam = new ArrayList<>();
    private static final int AGE_CUTOFF = 40;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Person person) {
        if (person.getAge() < AGE_CUTOFF) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}