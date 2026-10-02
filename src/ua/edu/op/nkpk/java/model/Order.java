package ua.edu.op.nkpk.java.model;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private int tableNumber;
    private String status;
    private LocalDateTime orderTime;

    public Order(int id, int tableNumber, String status) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.status = status;
        this.orderTime = LocalDateTime.now();
    }

    public double calculateTotal() { // Підрахунок суми замовлення
        return 0.0;
    }

    public void addPosition() {
        System.out.println("Позиція додана до замовлення №" + id);
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getTableNumber() { return tableNumber; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getOrderTime() { return orderTime; }
}