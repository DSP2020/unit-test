package mx.iteso.ut;

/**
 * Interfe.
 */

public interface Queso {
    /**
     *
     * @return si el queso se derritio
     */
    boolean isMelted();

    /**
     *
     * @return la temperatura actual del queso
     */
    int getCurrentTemperature();

    /**
     *
     * @return la temperatura en la que se derrite el queso
     */
    int getMeltingTemperature();

    /**
     *
     * @param temp to set temperature
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param melted si se ha derretido el queso
     */
    void melt(boolean melted);
}
