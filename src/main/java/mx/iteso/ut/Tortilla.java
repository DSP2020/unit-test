package mx.iteso.ut;

public interface Tortilla {
    /**
     * @return boolean
     */
    boolean isToasted();

    /**
     * @return int
     */
    int getToastTemperature();

    /**
     * @return int
     */
    int getCurrentTemperature();

    /**
     * @param temp
     */
    void setCurrentTemperature(int temp);

    /**
     * @param toasted
     */
    void toast(boolean toasted);

}
