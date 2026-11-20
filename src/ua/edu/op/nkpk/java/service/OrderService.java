package ua.edu.op.nkpk.java.service;

import ua.edu.op.nkpk.java.model.Order;
import ua.edu.op.nkpk.java.model.InventoryItem;
import ua.edu.op.nkpk.java.model.MenuItem;

/**
 * Сервісний клас для управління бізнес-логікою замовлень та перевірки складу.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class OrderService {

    /**
     * Реєструє та виводить інформацію про створення нового замовлення.
     *
     * @param order об'єкт замовлення
     */
    public void createNewOrder(Order order) {
        System.out.println("Створення нового замовлення №" + order.getId() + " для столика №" + order.getTableNumber());
    }

    /**
     * Оновлює статус замовлення та виводить його опис.
     *
     * @param order об'єкт замовлення
     * @param newStatus новий статус
     */
    public void updateOrderStatus(Order order, String newStatus) {
        order.setStatus(newStatus);
        order.printOrderStatusDescription();
    }

    /**
     * Перевіряє, чи не прострочений інгредієнт на складі, та обробляє
     * випадок передачі порожнього (null) об'єкта InventoryItem.
     *
     * @param item складська одиниця (InventoryItem)
     * @return true, якщо продукт прострочений, і false в іншому випадку або при помилці
     */
    public boolean checkInventoryExpiration(InventoryItem item) {
        try {
            if (item.isExpired()) {
                System.err.println("Увага! Продукт " + item.getName() + " прострочений!");
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            System.err.println("Помилка NullPointerException: відсутній (null) об'єкт класу InventoryItem.");
            return false;
        }
    }

    /**
     * Повертає елемент меню з масиву за вказаним індексом із захистом
     * від виходу за межі масиву.
     *
     * @param menuItems масив елементів меню
     * @param index індекс елемента в масиві
     * @return знайдений MenuItem або null у разі помилки
     */
    public MenuItem getMenuItemByIndex(MenuItem[] menuItems, int index) {
        try {
            return menuItems[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            int maxIndex = (menuItems != null && menuItems.length > 0) ? menuItems.length - 1 : -1;
            System.err.println("Помилка ArrayIndexOutOfBoundsException: некоректне звернення за індексом "
                    + index + ". Коректні межі масиву: від 0 до " + maxIndex + ".");
            return null;
        }
    }
}