package mx.iteso.ut;

/**
 * interface.
 */
interface Tortilla {
    /**
     *
     * @return isToasted boolean
     */
    boolean isToasted();

    /**
     *
     * @return getToastTemperature
     */
    int getToastTemperature();

    /**
     *
     * @return getCurrentTemperature
     */
    int getCurrentTemperature();

    /**
     *
     * @param temp int
     */
    void setCurrentTemperature(int temp);

    /**
     *
     * @param toasted boolean
     */
    void toast(boolean toasted);

}
