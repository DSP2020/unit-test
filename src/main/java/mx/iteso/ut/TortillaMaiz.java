package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {

    /**
     *
     */
    private boolean toasted;
    /**
     *
     */
    private int temperature;
    /**
     *
     */
    private final int toasting = 20;

    /**
     * @return boolean
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @return int
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * @param temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param newToastedValue
     */
    public void toast(final boolean newToastedValue) {
        this.toasted = newToastedValue;

    }
}
