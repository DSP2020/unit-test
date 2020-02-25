package mx.iteso.ut;

/**
 * Esta clase es queso Queso.
 * @version: 24/02/2020
 */
public interface Queso {
    /**
     * Metodo.
     * @return melted.
     */
    boolean isMelted();
    /**
     * Metodo.
     * @return current temp.
     */
    int getCurrentTemperature();
    /**
     * Metodo.
     * @return melting temperature.
     */
    int getMeltingTemperature();
    /**
     * Metodo.
     * @param temp temperatura.
     */
    void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param melted temperatura melted.
     */
    void melt(boolean melted);
}
