package SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.computers;

import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.BaseProduct;
import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.components.Component;
import SoftUniJavaOOP.ExamPreparationOOP.onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseComputer extends BaseProduct implements Computer {
    private List<Component> components;
    private List<Peripheral> peripherals;

    public BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        super(id, manufacturer, model, price, overallPerformance);
        this.components = new ArrayList<>();
        this.peripherals = new ArrayList<>();
    }

    @Override
    public List<Component> getComponents() {
        return this.components;
    }

    @Override
    public List<Peripheral> getPeripherals() {
        return this.peripherals;
    }

    @Override
    public void addComponent(Component component) {
        for (Component c : this.components) {
            if (c.getClass().equals(component.getClass())) {
                throw new IllegalArgumentException(String.format("Component %s already exists in %s with Id %d.",
                        component.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getId()));
            }
        }
        this.components.add(component);
    }

    public Component removeComponent(String componentType) {
        for (Component component : components) {
            if (component.getClass().getSimpleName().equals(componentType)) {
                components.remove(component);
                return component;
            }
        }
        throw new IllegalArgumentException(String.format("Component %s does not exist in %s with Id %d.",
                componentType, getClass().getSimpleName(), getId()));
    }


    @Override
    public void addPeripheral(Peripheral peripheral) {
        for (Peripheral p : this.peripherals) {
            if (p.getClass().equals(peripheral.getClass())) {
                throw new IllegalArgumentException(String.format("Peripheral %s already exists in %s with Id %d.",
                        peripheral.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getId()));
            }
        }
        this.peripherals.add(peripheral);
    }

    public Peripheral removePeripheral(String peripheralType) {
        for (Peripheral peripheral : peripherals) {
            if (peripheral.getClass().getSimpleName().equals(peripheralType)) {
                peripherals.remove(peripheral);
                return peripheral;
            }
        }
        throw new IllegalArgumentException(String.format("Peripheral %s does not exist in %s with Id %d.",
                peripheralType, getClass().getSimpleName(), getId()));
    }



    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();
        for (Component component : this.components) {
            totalPrice += component.getPrice();
        }
        for (Peripheral peripheral : this.peripherals) {
            totalPrice += peripheral.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double getOverallPerformance() {
        double totalPerformance = super.getOverallPerformance();
        if (!this.components.isEmpty()) {
            double sum = this.components.stream().mapToDouble(Component::getOverallPerformance).sum();
            totalPerformance += sum / this.components.size();
        }
        return totalPerformance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append(" Components (").append(this.components.size()).append("):").append(System.lineSeparator());
        for (Component component : this.components) {
            sb.append("  ").append(component).append(System.lineSeparator());
        }
        double avgPerformance = this.peripherals.stream().mapToDouble(Peripheral::getOverallPerformance).average().orElse(0);
        sb.append(String.format(" Peripherals (%d); Average Overall Performance (%.2f):", this.peripherals.size(), avgPerformance))
                .append(System.lineSeparator());
        for (Peripheral peripheral : this.peripherals) {
            sb.append("  ").append(peripheral).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
