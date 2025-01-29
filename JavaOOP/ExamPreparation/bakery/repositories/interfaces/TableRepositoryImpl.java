package SoftUniJavaOOP.ExamPreparationOOP.bakery.repositories.interfaces;

import SoftUniJavaOOP.ExamPreparationOOP.bakery.entities.tables.interfaces.Table;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class TableRepositoryImpl implements TableRepository<Table> {
    private Map<Integer, Table> tables;

    public TableRepositoryImpl() {
        this.tables = new LinkedHashMap<>();
    }

    @Override
    public Collection<Table> getAll() {
        return this.tables.values();
    }

    @Override
    public void add(Table table) {
        this.tables.put(table.getTableNumber(), table);
    }

    @Override
    public Table getByNumber(int number) {
        return this.tables.get(number);
    }
}