package ua.edu.op.nkpk.java.service;

import ua.edu.op.nkpk.java.model.Order;
import ua.edu.op.nkpk.java.model.InventoryItem;

public class OrderService {

    public void createNewOrder(Order order) {
        System.out.println("Створення нового замовлення №" + order.getId());
    }

    public void updateOrderStatus(Order order, String newStatus) {
        order.setStatus(newStatus);
        System.out.println("Статус замовлення змінено на: " + newStatus);
    }

    public boolean checkInventoryExpiration(InventoryItem item) {
        if (item.isExpired()) {
            System.out.println("Увага! Продукт " + item.getName() + " прострочений!");
            return true;
        }
        return false;
    }
}