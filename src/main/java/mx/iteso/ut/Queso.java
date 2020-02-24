package mx.iteso.ut;
/**
 * Queso!
 *
 */
public interface Queso {
    /**
     * isMelted!
     *@return boolean
     */
    boolean isMelted();
    /**
     * getCurrentTemperature!
     *@return int
     */
    int getCurrentTemperature();
    /**
     * getMeltingTemperature!
     *@return int
     */
    int getMeltingTemperature();
    /**
     * setCurrentTemperature!
     * @param temp
     * ashsah
     */
    void setCurrentTemperature(int temp);
    /**
     * melt!
     * @param melted
     * jsja
     */
    void melt(boolean melted);
}
