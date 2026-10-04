package ua.edu.op.nkpk.java.model;

import java.time.LocalDate;

//Клас описує складську одиницю (інгредієнт або товар).

public class InventoryItem {
    private int id;
    private String name;
    private double quantity;
    private String unit;
    private LocalDate expirationDate;

    public InventoryItem(int id, String name, double quantity, String unit, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
    }

    //Перевіряє, чи термін придатності минув.
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    //Симулює процес витрати інгредієнта за допомогою циклу while.
    public void consumeStock(double amountPerServing, int servingsCount) {
        int currentServing = 0;
        while (currentServing < servingsCount && quantity >= amountPerServing) {
            quantity -= amountPerServing;
            currentServing++;
        }
        System.out.printf("Витрачено інгредієнт: %s. Залишок: %.1f %s%n", name, quantity, unit);
    }

    
    //Гетери та сетери.
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public LocalDate getExpirationDate() { return expirationDate; }
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }
}