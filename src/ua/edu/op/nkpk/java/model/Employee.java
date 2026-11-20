package ua.edu.op.nkpk.java.model;

/**
 * Клас Employee описує працівника кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class Employee implements Nameable, Describable {
    private int id;
    private String name;
    private String role;
    private double salary;
    private String className;

    /**
     * Конструктор для створення нового працівника.
     *
     * @param id ідентифікатор працівника
     * @param name ім'я працівника
     * @param role посада працівника
     * @param salary заробітна плата
     */
    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.className = "Employee";
    }

    /**
     * Змінює заробітну плату з перевіркою за допомогою if/else та операторів порівняння.
     *
     * @param percent відсоток підвищення заробітної плати
     */
    public void updateSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100.0);
            System.out.println("Зарплату працівника " + name + " оновлено. Нова зарплата: " + salary);
        } else {
            System.out.println("Помилка: відсоток підвищення має бути більшим за 0!");
        }
    }

    /**
     * Перевантажений метод зміни заробітної плати: дозволяє підвищити її
     * або у відсотках, або на фіксовану суму.
     *
     * @param amount значення відсотка або фіксованої суми
     * @param isFixedAmount true — додати фіксовану суму, false — підвищити на відсоток
     */
    public void updateSalary(double amount, boolean isFixedAmount) {
        if (isFixedAmount) {
            if (amount > 0) {
                salary += amount;
                System.out.println("Зарплату працівника " + name + " збільшено на " + amount + ". Нова зарплата: " + salary);
            } else {
                System.out.println("Помилка: сума надбавки має бути більшою за 0!");
            }
        } else {
            updateSalary(amount);
        }
    }

    /**
     * Симулює процес прийняття замовлення працівником.
     */
    public void takeOrder() {
        System.out.println("Працівник " + name + " (" + role + ") прийняв замовлення.");
    }

    /**
     * Повертає короткий опис працівника.
     *
     * @return рядок з інформацією про працівника
     */
    @Override
    public String getShortInfo() {
        return "Працівник: " + name + ", посада: " + role + ", зарплата: " + salary;
    }

    // Гетери та сетери.
    /** @return ідентифікатор працівника */
    public int getId() { return id; }
    /** @param id новий ідентифікатор */
    public void setId(int id) { this.id = id; }

    /** @return ім'я працівника */
    public String getName() { return name; }
    /** @param name нове ім'я */
    public void setName(String name) { this.name = name; }

    /** @return посада працівника */
    public String getRole() { return role; }
    /** @param role нова посада */
    public void setRole(String role) { this.role = role; }

    /** @return заробітна плата */
    public double getSalary() { return salary; }
    /** @param salary нова заробітна плата */
    public void setSalary(double salary) { this.salary = salary; }

    /** @param name назва класу */
    @Override
    public void setClassName(String name) { this.className = name; }
    /** @return назва класу */
    @Override
    public String getClassName() { return className; }
}