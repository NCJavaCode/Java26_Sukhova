package ua.edu.op.nkpk.java.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.edu.op.nkpk.java.model.MenuItem;

import static org.junit.Assert.*;

/**
 * Модульні тести для класу OrderService.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class OrderServiceTest {
    private static OrderService orderService;
    private static MenuItem[] menuItems;

    @BeforeClass
    public static void setUpClass() {
        orderService = new OrderService();
        menuItems = new MenuItem[]{
                new MenuItem(1, "Espresso", 30.0, "Drink"),
                new MenuItem(2, "Croissant", 40.0, "Bakery")
        };
        System.out.println("Початок модульного тестування OrderServiceTest");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Завершення модульного тестування OrderServiceTest");
    }

    @Test
    public void testGetMenuItemByValidIndex() {
        MenuItem found = orderService.getMenuItemByIndex(menuItems, 1);
        assertTrue("Має бути знайдено елемент з індексом 1", found != null);
        assertEquals("Croissant", found.getName());
    }

    @Test
    public void testGetMenuItemByOutOfBoundsIndexReturnsNull() {
        MenuItem result = orderService.getMenuItemByIndex(menuItems, 10);
        assertNull("При виході за межі масиву має повертатися null", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArrayLengthThrowsNullPointerException() {
        MenuItem[] emptyRef = null;
        int len = emptyRef.length;
    }
}