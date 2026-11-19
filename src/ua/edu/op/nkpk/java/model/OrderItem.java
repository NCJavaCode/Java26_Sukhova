package ua.edu.op.nkpk.java.model;

/**
 * Клас описує окрему позицію всередині замовлення,
 * яка зв'язує конкретну страву з її кількістю.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class OrderItem implements Cloneable {
    private int id;
    private int quantity;
    private MenuItem menuItem;

    /**
     * Конструктор для створення позиції замовлення.
     *
     * @param id ідентифікатор позиції
     * @param quantity кількість порцій
     * @param menuItem посилання на страву з меню
     */
    public OrderItem(int id, int quantity, MenuItem menuItem) {
        this.id = id;
        this.quantity = quantity;
        this.menuItem = menuItem;
    }

    /**
     * Конструктор копіювання для створення глибокої копії позиції замовлення.
     *
     * @param other інший об'єкт OrderItem, з якого копіюється стан
     */
    public OrderItem(OrderItem other) {
        this(
                other != null ? other.id : 0,
                other != null ? other.quantity : 0,
                (other != null && other.menuItem != null) ? new MenuItem(other.menuItem) : null
        );
    }

    /**
     * Виконує глибоке клонування позиції замовлення разом із вкладеним об'єктом MenuItem.
     *
     * @return глибока копія об'єкта OrderItem
     * @throws CloneNotSupportedException якщо клонування не підтримується
     */
    @Override
    public OrderItem clone() throws CloneNotSupportedException {
        OrderItem cloned = (OrderItem) super.clone();
        if (this.menuItem != null) {
            cloned.menuItem = this.menuItem.clone();
        }
        return cloned;
    }

    /**
     * Збільшує кількість порцій на 1 за допомогою унарного оператора інкремента.
     */
    public void incrementQuantity() {
        quantity++;
    }

    /**
     * Повертає проміжну вартість позиції (ціна страви помножена на кількість)
     * за допомогою бінарного оператора множення.
     *
     * @return проміжна вартість позиції
     */
    public double getSubtotal() {
        if (menuItem != null) {
            return menuItem.getPrice() * quantity;
        }
        return 0.0;
    }

    // Гетери та сетери.
    /** @return ідентифікатор позиції */
    public int getId() { return id; }
    /** @param id новий ідентифікатор */
    public void setId(int id) { this.id = id; }

    /** @return кількість порцій */
    public int getQuantity() { return quantity; }
    /** @param quantity нова кількість порцій */
    public void setQuantity(int quantity) { this.quantity = quantity; }

    /** @return об'єкт страви з меню */
    public MenuItem getMenuItem() { return menuItem; }
    /** @param menuItem новий об'єкт страви */
    public void setMenuItem(MenuItem menuItem) { this.menuItem = menuItem; }
}