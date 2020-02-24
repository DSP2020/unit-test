package mx.iteso.ut;
/**
 * TortillaHarina!
 *
 */
public class TortillaHarina implements Tortilla {
    /**
     * T!
     */
    public static final int T = 25;
    /**
     * toast!
     *
     */
    private boolean toast;
    /**
     * toastTemperature!
     *
     */
    private int toastTemperature = T;
    /**
     * currentTemperature!
     *
     */
    private int currentTemperature;
    /**
     * isToasted!
     * @return boolean
     */
    public boolean isToasted() {
        return this.toast;
    }
    /**
     * getToastTemperature!
     * @return int
     */
    public int getToastTemperature() {
        return this.toastTemperature;
    }
    /**
     * getCurrentTemperature!
     * @return int
     */
    public int getCurrentTemperature() {
        return this.currentTemperature;
    }
    /**
     * setCurrentTemperature!
     * @param temp
     * abc
     */
    public void setCurrentTemperature(final int temp) {
        this.currentTemperature = temp;
    }
    /**
     * toast!
     * @param toasted
     * abc
     */
    public void toast(final boolean toasted) {
        this.toast = toasted;
    }
}
