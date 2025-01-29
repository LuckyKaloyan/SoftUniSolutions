package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.neighbourhood;

import SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.players.Player;

import java.util.Collection;

public interface Neighbourhood {
    void action(Player mainPlayer, Collection<Player> civilPlayers);
}
