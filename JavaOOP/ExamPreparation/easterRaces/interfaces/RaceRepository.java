package easterRaces.interfaces;

import easterRaces.entities.racers.Race;

public class RaceRepository extends BaseRepository<Race> {
    @Override
    protected String getName(Race race) {
        return race.getName();
    }
}
