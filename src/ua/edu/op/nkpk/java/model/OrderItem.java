package ua.edu.op.nkpk.java.model;

public class OrderItem {
    private int id;
    private int quantity;

    public OrderItem(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public double getSubtotal() { // Підрахунок підсумку
        return 0.0;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}