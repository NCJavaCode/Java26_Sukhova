package ua.edu.op.nkpk.java.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Клас Order описує замовлення в кафе.

public class Order {
    private int id;
    private int tableNumber;
    private String status; // ("НОВИЙ", "ГОТУЄТЬСЯ", "ГОТОВИЙ", "ЗАКРИТИЙ")
    private LocalDateTime orderTime;
    private List<OrderItem> items;

    public Order(int id, int tableNumber, String status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.status = status;
        this.orderTime = LocalDateTime.now();
        this.items = new ArrayList<>();
    }

    //Додає нову позицію до замовлення.
    public void addPosition(OrderItem item) {
        if (item != null && item.getQuantity() > 0) {
            items.add(item);
            System.out.println("Позицію додано до замовлення №" + id);
        }
    }

    //Обчислює загальну вартість замовлення за допомогою циклу for та арифметичних операторів.
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            OrderItem currentItem = items.get(i);
            total += currentItem.getSubtotal();
        }
        return total;
    }

    //Виводить опис статусу замовлення за допомогою конструкції switch.
    public void printOrderStatusDescription() {
        switch (status) {
            case "NEW":
                System.out.println("Замовлення №" + id + " створене і очікує підтвердження.");
                break;
            case "PREPARING":
                System.out.println("Кухня готує замовлення №" + id + ".");
                break;
            case "READY":
                System.out.println("Замовлення №" + id + " готове до видачі!");
                break;
            default:
                System.out.println("Статус замовлення №" + id + " невідомий.");
                break;
        }
    }


    //Гетери та сетери.
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getTableNumber() { return tableNumber; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getOrderTime() { return orderTime; }
    public List<OrderItem> getItems() { return items; }
}