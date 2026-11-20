package ua.edu.op.nkpk.java.model;

/**
 * Інтерфейс для отримання короткої інформації про об'єкт системи кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public interface Describable {
    /**
     * Повертає короткий текстовий опис стану об'єкта.
     *
     * @return рядок з описом об'єкта
     */
    String getShortInfo();
}