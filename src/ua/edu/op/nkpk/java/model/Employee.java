package ua.edu.op.nkpk.java.model;

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

    public void takeOrder() {
        System.out.println("Робітник " + name + " прийняв замовлення.");
    }

    public void updateStatus() {
        System.out.println("Статус оновлено робітником: " + name);
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}