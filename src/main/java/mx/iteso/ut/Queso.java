/**
 * my package.
 */
package mx.iteso.ut;

/**
 * Interface for Queso.
 */
public interface Queso {

    /**
     * @return boolean for is metleted or not.
     */
    boolean isMelted();

    /**
     *
     * @return int for get current temperature.
     */
    int getCurrentTemperature();

    /**
     *
     * @return int for getting melting temperature.
     */
    int getMeltingTemperature();

    /**
     *
     * @param temp for setting current temperature.
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param melted for melt.
     */
    void melt(boolean melted);
}
