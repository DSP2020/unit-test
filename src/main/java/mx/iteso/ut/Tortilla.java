package mx.iteso.ut;

/**
 *
 */
public interface Tortilla {
    /**
     *
     * @return Indica si la tortilla esta tostada.
     */
    boolean isToasted();

    /**
     *
     * @return Devuelve la temperatura a la que se tuesta una tortilla.
     */
    int getToastTemperature();

    /**
     *
     * @return Devuelve la temperatura de la tortilla.
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp Inicializa la temperatura.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted Indica si la tortilla esta tostada
     */
    void toast(boolean toasted);

}
