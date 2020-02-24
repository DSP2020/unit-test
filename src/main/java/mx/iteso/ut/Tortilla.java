package mx.iteso.ut;
/**
 * Tortilla!
 *
 */
public interface Tortilla {
    /**
     * isToasted!
     * @return boolean
     */
    boolean isToasted();
    /**
     * getToastTemperature!
     * @return int
     */
    int getToastTemperature();
    /**
     * getCurrentTemperature!
     * @return int
     */
    int getCurrentTemperature();
    /**
     * setCurrentTemperature!
     * @param temp
     * akdkd
     */
    void setCurrentTemperature(int temp);
    /**
     * toast!
     * @param toasted
     * sdk
     */
    void toast(boolean toasted);
}
