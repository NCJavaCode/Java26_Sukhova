package ua.edu.op.nkpk.java.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас Order описує замовлення в кафе, що містить список позицій,
 * інформацію про номер столика, статус та час створення.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Order {
    private int id;
    private int tableNumber;
    private String status; // ("NEW", "PREPARING", "READY", "CLOSED")
    private LocalDateTime orderTime;
    private List<OrderItem> items;

    /**
     * Конструктор для створення нового замовлення.
     *
     * @param id ідентифікатор замовлення
     * @param tableNumber номер столика
     * @param status поточний статус замовлення
     */
    public Order(int id, int tableNumber, String status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.status = status;
        this.orderTime = LocalDateTime.now();
        this.items = new ArrayList<>();
    }

    /**
     * Додає нову позицію до замовлення з перевіркою на валідність.
     * Позиція додається, якщо вона не null і її кількість більша за нуль.
     *
     * @param item позиція замовлення (OrderItem)
     */
    public void addPosition(OrderItem item) {
        if (item != null && item.getQuantity() > 0) {
            items.add(item);
            System.out.println("Позицію додано до замовлення №" + id);
        }
    }

    /**
     * Обчислює загальну вартість замовлення за допомогою циклу for
     * та арифметичних операторів шляхом підсумовування вартості всіх позицій.
     *
     * @return загальна вартість замовлення
     */
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            OrderItem currentItem = items.get(i);
            total += currentItem.getSubtotal();
        }
        return total;
    }

    /**
     * Виводить опис статусу замовлення за допомогою конструкції switch.
     */
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

    // Гетери та сетери.
    /** @return ідентифікатор замовлення */
    public int getId() { return id; }
    /** @param id новий ідентифікатор */
    public void setId(int id) { this.id = id; }

    /** @return номер столика */
    public int getTableNumber() { return tableNumber; }
    /** @param tableNumber новий номер столика */
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }

    /** @return статус замовлення */
    public String getStatus() { return status; }
    /** @param status новий статус */
    public void setStatus(String status) { this.status = status; }

    /** @return час створення замовлення */
    public LocalDateTime getOrderTime() { return orderTime; }
    /** @return список позицій у замовленні */
    public List<OrderItem> getItems() { return items; }
}