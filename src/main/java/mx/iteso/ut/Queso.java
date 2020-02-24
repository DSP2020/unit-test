package mx.iteso.ut;

/**
 * Clase que define al objeto de tipo queso.
 */
public interface Queso {

    /**
     *
     * @return True o false dependiendo de la temperatura.
     */
    boolean isMelted();

    /**
     *
     * @return Devuelve la temperatura de la quesadilla.
     */
    int getCurrentTemperature();

    /**
     *
     * @return Devuelve la temperatura a la que se derrite el queso.
     */
    int getMeltingTemperature();

    /**
     *
     * @param temp Representa la temperatura actual de la quesadilla.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param melted Derrite la quesadilla.
     */
    void melt(boolean melted);
}
