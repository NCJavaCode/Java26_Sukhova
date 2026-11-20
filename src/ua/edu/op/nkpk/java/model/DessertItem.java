package ua.edu.op.nkpk.java.model;

/**
 * Клас-спадкоємець CafeItem, який описує десерт у кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class DessertItem extends CafeItem {
    private int calories;
    private boolean containsNuts;

    /**
     * Конструктор для створення об'єкта десерту.
     *
     * @param id ідентифікатор десерту
     * @param name назва десерту
     * @param calories калорійність десерту в ккал
     * @param containsNuts ознака наявності горіхів у складі
     */
    public DessertItem(int id, String name, int calories, boolean containsNuts) {
        super(id, name);
        setCalories(calories);
        this.containsNuts = containsNuts;
    }

    /**
     * Формує короткий опис десерту з калорійністю та інформацією про горіхи.
     *
     * @return текстовий опис десерту
     */
    @Override
    public String getSummary() {
        String nutsNote = containsNuts ? "містить горіхи" : "без горіхів";
        return "Десерт (" + calories + " ккал, " + nutsNote + "): " + name;
    }

    // Гетери та сетери.
    /** @return калорійність десерту в ккал */
    public int getCalories() { return calories; }
    /** @param calories нова калорійність десерту в ккал */
    public void setCalories(int calories) {
        if (calories >= 0) {
            this.calories = calories;
        }
    }

    /** @return true, якщо десерт містить горіхи, інакше false */
    public boolean isContainsNuts() { return containsNuts; }
    /** @param containsNuts нова ознака наявності горіхів */
    public void setContainsNuts(boolean containsNuts) { this.containsNuts = containsNuts; }
}