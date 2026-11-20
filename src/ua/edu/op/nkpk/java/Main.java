package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.MenuItem;
import ua.edu.op.nkpk.java.service.OrderService;

/**
 * Головний клас програми для тестування роботи всієї системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // Перевірка обробки ArrayIndexOutOfBoundsException
        MenuItem[] menuArray = {
                new MenuItem(1, "Pie", 50.0, "Dessert"),
                new MenuItem(2, "Coffee", 35.0, "Drink")
        };
        orderService.getMenuItemByIndex(menuArray, 5);

        // Перевірка обробки NullPointerException
        orderService.checkInventoryExpiration(null);
    }
}