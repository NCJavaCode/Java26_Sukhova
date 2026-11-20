package ua.edu.op.nkpk.java.model;

import java.util.Objects;

/**
 * Клас описує позицію в меню кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class MenuItem implements Cloneable, Nameable, Describable {
    private int id;
    private String name;
    private double price;
    private String category;
    private String className;

    /**
     * Конструктор для створення елемента меню.
     *
     * @param id ідентифікатор страви
     * @param name назва страви
     * @param price ціна страви
     * @param category категорія (напої, десерти)
     */
    public MenuItem(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.className = "MenuItem";
    }

    /**
     * Конструктор копіювання для створення копії елемента меню.
     *
     * @param other об'єкт MenuItem для копіювання
     */
    public MenuItem(MenuItem other) {
        this(
                other != null ? other.id : 0,
                other != null ? other.name : null,
                other != null ? other.price : 0.0,
                other != null ? other.category : null
        );
    }

    /**
     * Створює копію елемента меню за допомогою super.clone().
     *
     * @return копія об'єкта MenuItem
     * @throws CloneNotSupportedException якщо клонування не підтримується
     */
    @Override
    public MenuItem clone() throws CloneNotSupportedException {
        return (MenuItem) super.clone();
    }

    /**
     * Змінює ціну страви з перевіркою на валідність через if/else.
     *
     * @param newPrice нова ціна страви
     */
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("Ціну страви " + name + " успішно оновлено.");
        } else {
            System.out.println("Помилка: ціна не може бути від'ємною або нульовою!");
        }
    }

    /**
     * Повертає короткий опис елемента меню.
     *
     * @return рядок з інформацією про страву
     */
    @Override
    public String getShortInfo() {
        return "Страва: " + name + " (" + category + "), ціна: " + price + " грн";
    }

    /**
     * Порівнює поточний елемент меню з іншим об'єктом за ідентифікатором,
     * ціною, назвою та категорією.
     *
     * @param o об'єкт для порівняння
     * @return true, якщо об'єкти ідентичні, інакше false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id &&
                Double.compare(menuItem.price, price) == 0 &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(category, menuItem.category);
    }

    /**
     * Повертає хеш-код елемента меню, узгоджений із методом equals().
     *
     * @return цілочисельний хеш-код об'єкта
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category);
    }

    // Гетери та сетери.
    /** @return ідентифікатор страви */
    public int getId() { return id; }
    /** @param id новий ідентифікатор */
    public void setId(int id) { this.id = id; }

    /** @return назва страви */
    public String getName() { return name; }
    /** @param name нова назва */
    public void setName(String name) { this.name = name; }

    /** @return ціна страви */
    public double getPrice() { return price; }
    /** @param price нова ціна */
    public void setPrice(double price) { this.price = price; }

    /** @return категорія страви */
    public String getCategory() { return category; }
    /** @param category нова категорія */
    public void setCategory(String category) { this.category = category; }

    /** @param name назва класу */
    @Override
    public void setClassName(String name) { this.className = name; }
    /** @return назва класу */
    @Override
    public String getClassName() { return className; }
}