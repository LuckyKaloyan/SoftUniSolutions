package SoftUniJavaOOP.ExamPreparationOOP.goldDigger.models.museum;

import java.util.Collection;
import java.util.HashSet;

public class BaseMuseum implements Museum {
    private Collection<String> exhibits;

    public BaseMuseum() {
        this.exhibits = new HashSet<>();
    }

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    public void addExhibit(String exhibit) {
        exhibits.add(exhibit);
    }

    public boolean removeExhibit(String exhibit) {
        return exhibits.remove(exhibit);
    }
}
