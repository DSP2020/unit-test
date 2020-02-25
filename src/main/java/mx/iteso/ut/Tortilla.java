package mx.iteso.ut;

/**
 * Esta clase es Tortilla.
 * @version: 24/02/2020
 */
public interface Tortilla {
    /**
     * Metodo.
     * @return melted.
     */
    boolean isToasted();
    /**
     * Metodo.
     * @return current temp.
     */
    int getToastTemperature();
    /**
     * Metodo.
     * @return current temperature.
     */
    int getCurrentTemperature();
    /**
     * Metodo.
     * @param temp temperatura.
     */
    void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param toasted temperatura melted.
     */
    void toast(boolean toasted);

}
