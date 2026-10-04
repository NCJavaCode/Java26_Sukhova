package ua.edu.op.nkpk.java.model;

//Клас описує позицію в меню кафе.
public class MenuItem {
    private int id;
    private String name;
    private double price;
    private String category;

    public MenuItem(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Змінює ціну страви з перевіркою на валідність через if/else.
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("Ціну страви " + name + " успішно оновлено.");
        } else {
            System.out.println("Помилка: ціна не може бути від'ємною або нульовою!");
        }
    }


    //Гетери та сетери.
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}