package ua.edu.op.nkpk.java.model;

/**
 * Інтерфейс для класів, які зберігають та повертають власну назву класу.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public interface Nameable {
    /**
     * Встановлює назву класу.
     *
     * @param name назва класу
     */
    void setClassName(String name);
    /**
     * Повертає назву класу.
     *
     * @return назва класу
     */
    String getClassName();
}