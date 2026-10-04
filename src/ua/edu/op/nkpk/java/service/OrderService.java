package ua.edu.op.nkpk.java.service;

import ua.edu.op.nkpk.java.model.Order;
import ua.edu.op.nkpk.java.model.InventoryItem;

/**
 * Сервісний клас для управління бізнес-логікою замовлень та перевірки складу.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class OrderService {

    /**
     * Реєструє та виводить інформацію про створення нового замовлення.
     *
     * @param order об'єкт замовлення
     */
    public void createNewOrder(Order order) {
        System.out.println("Створення нового замовлення №" + order.getId() + " для столика №" + order.getTableNumber());
    }

    /**
     * Оновлює статус замовлення та виводить його опис.
     *
     * @param order об'єкт замовлення
     * @param newStatus новий статус
     */
    public void updateOrderStatus(Order order, String newStatus) {
        order.setStatus(newStatus);
        order.printOrderStatusDescription();
    }

    /**
     * Перевіряє, чи не прострочений інгредієнт на складі.
     *
     * @param item складська одиниця (InventoryItem)
     * @return true, якщо продукт прострочений, і false в іншому випадку
     */
    public boolean checkInventoryExpiration(InventoryItem item) {
        if (item.isExpired()) {
            System.out.println("Увага! Продукт " + item.getName() + " прострочений!");
            return true;
        }
        return false;
    }
}