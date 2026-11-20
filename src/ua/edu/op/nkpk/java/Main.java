package ua.edu.op.nkpk.java;

import ua.edu.op.nkpk.java.model.CafeItem;
import ua.edu.op.nkpk.java.model.DrinkItem;
import ua.edu.op.nkpk.java.model.DessertItem;

/**
 * Головний клас програми для тестування роботи всієї системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CafeItem latte = new DrinkItem(113, "Капучино", 250, true);
        CafeItem cheesecake = new DessertItem(131, "Чизкейк", 340, false);

        latte.printBasicInfo();
        System.out.println(latte.getSummary());

        cheesecake.printBasicInfo();
        System.out.println(cheesecake.getSummary());
    }
}