package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public interface Tortilla {
    /**
     * @return boolean
     */
    boolean isToasted();

    /**
     * @return int
     */
    int getToastTemperature();

    /**
     * @return int
     */
    int getCurrentTemperature();

    /**
     * @param t
     * temperature
     */
    void setCurrentTemperature(int t);

    /**
     * @param t
     * toast
     */
    void toast(boolean t);
}
