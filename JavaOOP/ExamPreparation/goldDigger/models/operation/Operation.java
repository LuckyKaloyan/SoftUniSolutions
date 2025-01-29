package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.operation;

import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.discoverer.Discoverer;
import SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.spot.Spot;

import java.util.Collection;

public interface Operation {
    void startOperation(Spot spot, Collection<Discoverer> discoverers);

}
