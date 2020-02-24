package mx.iteso.ut;

/**
 * Tortilla interface.
 */
public interface Tortilla {

    /**
     * When is toasted or not.
     * @return boolean
     */
    boolean isToasted();

    /**
     * Get toast temperature.
     * @return int
     */
    int getToastTemperature();

    /**
     * Get current temperature.
     * @return int
     */
    int getCurrentTemperature();

    /**
     * @param temp for getting temp.
     */
    void setCurrentTemperature(int temp);

    /**
     * @param toasted for toasting.
     */
    void toast(boolean toasted);

}
