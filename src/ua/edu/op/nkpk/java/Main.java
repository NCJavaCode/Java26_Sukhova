package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.*;
import ua.edu.op.nkpk.java.service.OrderService;

import java.time.LocalDate;

/**
 * Головний клас програми для тестування роботи всієї системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem(1, "Pie", 50.0, "Dessert");
        MenuItem menuItem2 = new MenuItem(1, "Pie", 50.0, "Dessert");
        MenuItem menuItem3 = new MenuItem(1, "Pie", 65.0, "Dessert");

        System.out.println("Порівняння menuItem та menuItem2: " + menuItem.equals(menuItem2));
        System.out.println("Порівняння menuItem та menuItem3: " + menuItem.equals(menuItem3));
        System.out.println("Хеш-код 1: " + menuItem.hashCode());
        System.out.println("Хеш-код 2: " + menuItem2.hashCode());
        System.out.println("Хеш-код 3: " + menuItem3.hashCode());
    }
}