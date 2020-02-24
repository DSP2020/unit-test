package mx.iteso.ut;

/**
 * Interface.
 */
public interface Queso {
    /**
     * Se derrite.
     * @return boolean
     */
    boolean isMelted();

    /**
     * Temperatura.
     * @return int
     */
    int getCurrentTemperature();

    /**
     * Temperatura de derretido.
     * @return int
     */
    int getMeltingTemperature();

    /**
     * Temperatura.
     * @param temp temperatura.
     */
    void setCurrentTemperature(int temp);

    /**
     * Derretido.
     * @param melted se derrite.
     */
    void melt(boolean melted);
}
