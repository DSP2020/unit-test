package mx.iteso.ut;

/**
 * method.
 */
public interface Queso {
    /**
     * @return null
     */
    boolean isMelted();
    /**
     * @return null
     */
    int getCurrentTemperature();
    /**
     * @return null
     */
    int getMeltingTemperature();
    /**
     * @param temp setTemperature
     */
    void setCurrentTemperature(int temp);
    /**
     * @param melted if isMelted
     */
     void melt(boolean melted);
}
