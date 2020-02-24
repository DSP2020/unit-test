package mx.iteso.ut;

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
     * @param temp
     */
    void setCurrentTemperature(int temp);

    /**
     * @param melted
     */
    void melt(boolean melted);
}
