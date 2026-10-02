package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.*;
import ua.edu.op.nkpk.java.service.OrderService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Створення робітника
        Employee chef = new Employee(1, "Вікторія", "Кухар", 99999.0);
        chef.takeOrder();

        // Створення замовлення
        Order order = new Order(31, 13, "Новий");
        order.addPosition();

        // Створення продукту на складі
        LocalDate expiryDate = LocalDate.of(2026, 9, 13);
        InventoryItem milk = new InventoryItem(1, "Молоко", 13.5, "л", expiryDate);

        // Створення нового замовлення
        OrderService orderService = new OrderService();
        orderService.createNewOrder(order);

        // Перевірка строку придатності
        orderService.checkInventoryExpiration(milk);
    }
}