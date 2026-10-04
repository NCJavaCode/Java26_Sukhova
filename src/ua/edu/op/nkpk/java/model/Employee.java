package ua.edu.op.nkpk.java.model;

//Клас Employee описує працівника кафе.

public class Employee {
    private int id;
    private String name;
    private String role;
    private double salary;

    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    //Змінює заробітну плату з перевіркою за допомогою if/else та операторів порівняння.
    public void updateSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100.0);
            System.out.println("Зарплату працівника " + name + " оновлено. Нова зарплата: " + salary);
        } else {
            System.out.println("Помилка: відсоток підвищення має бути більшим за 0!");
        }
    }

    //Симулює процес прийняття замовлення працівником.
    public void takeOrder() {
        System.out.println("Працівник " + name + " (" + role + ") прийняв замовлення.");
    }


    //Гетери та сетери.
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}