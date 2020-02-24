package mx.iteso.ut;
/**
 * tortillaMaiz!
 *
 */
public class TortillaMaiz implements Tortilla {
    /**
     * T!
     */
    public static final int T = 25;
    /**
     * Toast!
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
     * adjdjd
     */
    public void setCurrentTemperature(final int temp) {
        this.currentTemperature = temp;
    }
    /**
     * toast!
     * @param toasted
     * abcd
     */
    public void toast(final boolean toasted) {
        this.toast = toasted;
    }
}
