package mx.iteso.ut;

public interface Queso {
    /**
     * Melted check.
     * @return boolean
     */
    boolean isMelted();
    /**
     * Get temp.
     * @return int
     */
    int getCurrentTemperature();
    /**
     * Get melt temp.
     * @return int
     */
    int getMeltingTemperature();
    /**
     * Set temp.
     * @param temp
     */
    void setCurrentTemperature(int temp);
    /**
     * Change melted state.
     * @param melted
     */
    void melt(boolean melted);
}
