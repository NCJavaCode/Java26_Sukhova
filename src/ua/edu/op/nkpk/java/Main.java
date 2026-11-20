package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.CafeItem;
import ua.edu.op.nkpk.java.model.DessertItem;
import ua.edu.op.nkpk.java.model.DrinkItem;
import ua.edu.op.nkpk.java.model.Employee;

/**
 * Головний клас програми для тестування роботи системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Демонстрація статичного поліморфізму
        Employee barista = new Employee(1, "Anna", "Barista", 15000.0);
        barista.updateSalary(10.0);
        barista.updateSalary(2000.0, true);

        // Демонстрація динамічного поліморфізму
        CafeItem[] assortment = {
                new DrinkItem(101, "Капучино", 250, true),
                new DessertItem(201, "Чизкейк", 340, false),
                new DrinkItem(102, "Айс лате", 300, false)
        };

        for (CafeItem item : assortment) {
            item.printBasicInfo();
            System.out.println(item.getSummary());
        }
    }
}