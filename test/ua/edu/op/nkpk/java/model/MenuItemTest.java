package ua.edu.op.nkpk.java.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Модульні тести для класу MenuItem.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class MenuItemTest {
    private static MenuItem sampleItem;

    @BeforeClass
    public static void setUpClass() {
        sampleItem = new MenuItem(1, "Latte", 45.0, "Drink");
        System.out.println("Початок модульного тестування MenuItemTest");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Завершення модульного тестування MenuItemTest");
    }

    @Test
    public void testUpdatePriceValid() {
        MenuItem item = new MenuItem(2, "Pie", 50.0, "Dessert");
        item.updatePrice(60.0);
        assertEquals("Ціна страви повинна оновитися", 60.0, item.getPrice(), 0.001);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        MenuItem cloned = sampleItem.clone();
        assertTrue("Клон має бути еквівалентним оригіналу за equals()", sampleItem.equals(cloned));
        assertEquals("Хеш-коди еквівалентних об'єктів мають збігатися", sampleItem.hashCode(), cloned.hashCode());
    }

    @Test(expected = NullPointerException.class)
    public void testCloneNullSourceThrowsException() throws CloneNotSupportedException {
        MenuItem nullItem = null;
        nullItem.clone();
    }
}