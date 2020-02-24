package mx.iteso.ut;

/**
 * Tortillas.
 */
public interface Tortilla {
    /**
     * Se tosta.
     * @return boolean
     */
    boolean isToasted();

    /**
     * Retorna temperatura de tostado.
     * @return int.
     */
    int getToastTemperature();

    /**
     * Temperatura.
     * @return int.
     */
    int getCurrentTemperature();

    /**
     * Set temperatura.
     * @param temp temperatura.
     */
    void setCurrentTemperature(int temp);

    /**
     * Set tostado.
     * @param toasted tostado
     */
    void toast(boolean toasted);

}
