package mx.iteso.ut;

/**
 * Interface Tortilla.
 */

public interface Tortilla {
    /**
     *
     * @return si la tortilla se tostó.
     */
    boolean isToasted();

    /**
     *
     * @return la temperatura en la que la quesadilla se tostó.
     */
    int getToastTemperature();

    /**
     *
     * @return la temperatura actual de la tortilla.
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp to set temperature.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted para setear si la tortilla se tostó.
     */
    void toast(boolean toasted);

}
