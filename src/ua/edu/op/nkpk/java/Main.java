package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.Describable;
import ua.edu.op.nkpk.java.model.Employee;
import ua.edu.op.nkpk.java.model.MenuItem;
import ua.edu.op.nkpk.java.model.Nameable;

/**
 * Головний клас програми для тестування роботи системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Робота через інтерфейс Nameable
        Nameable namedEntity = new Employee(1, "Anna", "Barista", 13000.0);
        System.out.println("Поточний клас: " + namedEntity.getClassName());

        namedEntity = new MenuItem(1, "Pie", 50.0, "Dessert");
        System.out.println("Після заміни об'єкта: " + namedEntity.getClassName());

        // Робота через власний інтерфейс Describable
        Describable[] items = {
                new Employee(2, "Olena", "Manager", 31000.0),
                new MenuItem(2, "Latte", 45.0, "Drink")
        };

        for (Describable item : items) {
            System.out.println(item.getShortInfo());
        }
    }
}