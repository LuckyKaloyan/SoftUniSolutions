package SoftUniJavaOOP.ExamPreparationOOP.handball.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.handball.entities.equipment.Equipment;

import java.util.ArrayList;
import java.util.Collection;

public  class EquipmentRepository {
    private Collection<Equipment> equipments;

    public EquipmentRepository() {
        this.equipments = new ArrayList<>();
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public boolean remove(Equipment equipment) {
        try {
            equipments.remove(equipment);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public Equipment findByType(String type) {
        for (Equipment equipment : equipments) {
            if (equipment.getClass().getSimpleName().equals(type)) {
                return equipment;
            }
        }
        return null;
    }
}
