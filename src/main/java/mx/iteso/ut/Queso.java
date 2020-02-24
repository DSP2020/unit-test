package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public interface Queso {
    /**
     * @return boolean
     */
    boolean isMelted();

    /**
     * @return int
     */
    int getCurrentTemperature();

    /**
     * @return int
     */
    int getMeltingTemperature();

    /**
     * @param t
     * temperature
     */
    void setCurrentTemperature(int t);

    /**
     * @param melted
     * melted
     */
    void melt(boolean melted);
}
