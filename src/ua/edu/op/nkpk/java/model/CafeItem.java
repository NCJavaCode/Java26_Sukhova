package ua.edu.op.nkpk.java.model;

/**
 * Абстрактний базовий клас для об'єктів асортименту кафе.
 * Об'єднує спільні поля та загальну поведінку спадкоємців.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public abstract class CafeItem {
    protected int id;
    protected String name;

    /**
     * Конструктор базового елемента кафе.
     *
     * @param id ідентифікатор елемента
     * @param name назва елемента
     */
    protected CafeItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Повертає короткий текстовий опис елемента асортименту.
     *
     * @return текстовий опис елемента
     */
    public abstract String getSummary();

    /**
     * Виводить у консоль основну інформацію про елемент (ідентифікатор та назву).
     */
    public void printBasicInfo() {
        System.out.println("[" + id + "] " + name);
    }

    // Гетери та сетери.
    /** @return ідентифікатор елемента */
    public int getId() { return id; }
    /** @param id новий ідентифікатор елемента */
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    /** @return назва елемента */
    public String getName() { return name; }
    /** @param name нова назва елемента */
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
}