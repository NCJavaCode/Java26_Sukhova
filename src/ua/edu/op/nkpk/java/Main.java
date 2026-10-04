package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.*;
import ua.edu.op.nkpk.java.service.OrderService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Створння страви в меню
        MenuItem coffee = new MenuItem(1, "Капучино", 65.0, "Напої");
        MenuItem cheesecake = new MenuItem(2, "Чізкейк", 95.0, "Десерти");

        //Створення позиції замовлення
        OrderItem item1 = new OrderItem(1, 2, coffee);     // 2 капучино
        OrderItem item2 = new OrderItem(2, 1, cheesecake); // 1 чізкейк

        //Створення замовлення для столика №13
        Order order = new Order(31, 13, "NEW");

        //Додавання позиції через метод з перевірками
        order.addPosition(item1);
        order.addPosition(item2);

        //Перевірка роботи підрахунку суми
        double totalSum = order.calculateTotal();
        System.out.println("Загальна сума замовлення: " + totalSum + " грн");

        //Перевірка роботи статусу
        OrderService service = new OrderService();
        service.createNewOrder(order);
        service.updateOrderStatus(order, "PREPARING");
        service.updateOrderStatus(order, "READY");

        //Перевірка роботи процесу використання продуктів на складі
        LocalDate expiryDate = LocalDate.now().plusDays(5);
        InventoryItem milk = new InventoryItem(1, "Молоко", 2.0, "л", expiryDate);
        service.checkInventoryExpiration(milk);
        milk.consumeStock(0.3, 3); //Використання інгредієнта на 3 порції
    }
}