package ua.edu.op.nkpk.java.model;

import java.time.LocalDate;

/**
 * Клас описує складську одиницю (інгредієнт або товар).
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class InventoryItem {
    private int id;
    private String name;
    private double quantity;
    private String unit;
    private LocalDate expirationDate;

    /**
     * Конструктор для створення складської одиниці.
     *
     * @param id ідентифікатор товару
     * @param name назва товару
     * @param quantity кількість на складі
     * @param unit одиниця виміру (л, кг)
     * @param expirationDate термін придатності
     */
    public InventoryItem(int id, String name, double quantity, String unit, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
    }

    /**
     * Перевіряє, чи термін придатності минув.
     *
     * @return true, якщо продукт прострочений, і false в іншому випадку
     */
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    /**
     * Симулює процес витрати інгредієнта за допомогою циклу while.
     *
     * @param amountPerServing витрата інгредієнта на одну порцію
     * @param servingsCount кількість порцій
     */
    public void consumeStock(double amountPerServing, int servingsCount) {
        int currentServing = 0;
        while (currentServing < servingsCount && quantity >= amountPerServing) {
            quantity -= amountPerServing;
            currentServing++;
        }
        System.out.printf("Витрачено інгредієнт: %s. Залишок: %.1f %s%n", name, quantity, unit);
    }

    // Гетери та сетери.
    /** @return ідентифікатор товару */
    public int getId() { return id; }
    /** @param id новий ідентифікатор */
    public void setId(int id) { this.id = id; }

    /** @return назва товару */
    public String getName() { return name; }
    /** @param name нова назва */
    public void setName(String name) { this.name = name; }

    /** @return кількість на складі */
    public double getQuantity() { return quantity; }
    /** @param quantity нова кількість */
    public void setQuantity(double quantity) { this.quantity = quantity; }

    /** @return одиниця виміру */
    public String getUnit() { return unit; }
    /** @param unit нова одиниця виміру */
    public void setUnit(String unit) { this.unit = unit; }

    /** @return термін придатності */
    public LocalDate getExpirationDate() { return expirationDate; }
    /** @param expirationDate новий термін придатності */
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }
}