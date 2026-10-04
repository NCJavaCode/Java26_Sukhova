package ua.edu.op.nkpk.java.model;

//Клас описує окрему позицію всередині замовлення.

public class OrderItem {
    private int id;
    private int quantity;
    private MenuItem menuItem;

    public OrderItem(int id, int quantity, MenuItem menuItem) {
        this.id = id;
        this.quantity = quantity;
        this.menuItem = menuItem;
    }

    //Збільшує кількість порцій на 1.
    public void incrementQuantity() {
        quantity++;
    }

    //Повертає проміжну вартість (ціна * кількість) за допомогою бінарного оператора (*).
    public double getSubtotal() {
        if (menuItem != null) {
            return menuItem.getPrice() * quantity;
        }
        return 0.0;
    }

    //Гетери та сетери.
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public MenuItem getMenuItem() { return menuItem; }
    public void setMenuItem(MenuItem menuItem) { this.menuItem = menuItem; }
}