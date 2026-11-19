package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.MenuItem;
import ua.edu.op.nkpk.java.model.OrderItem;

/**
 * Головний клас програми для тестування роботи всієї системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        MenuItem pie = new MenuItem(1, "Pie", 50.0, "Dessert");
        OrderItem originalItem = new OrderItem(10, 2, pie);

        try {
            // Клонування через метод clone()
            OrderItem clonedByMethod = originalItem.clone();

            // Клонування через конструктор копіювання
            OrderItem clonedByConstructor = new OrderItem(originalItem);

            // Перевірка правил clone()
            System.out.println("Чи створено новий об'єкт при клонуванні: " + (clonedByMethod != originalItem));
            System.out.println("Однаковий клас: " + (clonedByMethod.getClass() == originalItem.getClass()));

            // Перевірка глибокого копіювання
            clonedByMethod.getMenuItem().setPrice(113.0);
            clonedByConstructor.setQuantity(5);

            System.out.println("1. Ціна страви (оригінал): " + originalItem.getMenuItem().getPrice() + ", кількість: " + originalItem.getQuantity());
            System.out.println("2. Ціна страви (копія через clone): " + clonedByMethod.getMenuItem().getPrice() + ", кількість: " + clonedByMethod.getQuantity());
            System.out.println("3. Ціна страви (копія через конструктор): " + clonedByConstructor.getMenuItem().getPrice() + ", кількість: " + clonedByConstructor.getQuantity());
        } catch (CloneNotSupportedException e) {
            System.out.println("Помилка під час клонування об'єкта: " + e.getMessage());
        }
    }
}