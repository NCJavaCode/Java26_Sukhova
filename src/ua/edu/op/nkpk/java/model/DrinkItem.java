package ua.edu.op.nkpk.java.model;

/**
 * Клас-спадкоємець CafeItem, який описує напій у кафе.
 *
 * @author Viktoriia Sukhova
 * @version 1.0
 */
public class DrinkItem extends CafeItem {
    private int volumeMl;
    private boolean hot;

    /**
     * Конструктор для створення об'єкта напою.
     *
     * @param id ідентифікатор напою
     * @param name назва напою
     * @param volumeMl об'єм напою в мілілітрах
     * @param hot ознака того, чи подається напій гарячим
     */
    public DrinkItem(int id, String name, int volumeMl, boolean hot) {
        super(id, name);
        setVolumeMl(volumeMl);
        this.hot = hot;
    }

    /**
     * Формує короткий опис напою з урахуванням температури подачі та об'єму.
     *
     * @return текстовий опис напою
     */
    @Override
    public String getSummary() {
        String temp = hot ? "гарячий" : "холодний";
        return "Напій (" + temp + ", " + volumeMl + " мл): " + name;
    }

    // Гетери та сетери.
    /** @return об'єм напою в мілілітрах */
    public int getVolumeMl() { return volumeMl; }
    /** @param volumeMl новий об'єм напою в мілілітрах */
    public void setVolumeMl(int volumeMl) {
        if (volumeMl > 0) {
            this.volumeMl = volumeMl;
        }
    }

    /** @return true, якщо напій гарячий, інакше false */
    public boolean isHot() { return hot; }
    /** @param hot нова ознака гарячого напою */
    public void setHot(boolean hot) { this.hot = hot; }
}