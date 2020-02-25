package mx.iteso.ut;

/**
 * clase que implementa la inteface Tortilla.
 */
public class TortillaHarina implements Tortilla {
    /**
     * testing value for toastTemperature.
     */
    static final int TOAST_TEMPERATURE_TEST = 10;
    /**
     * booleano para saber si se tostó la toritilla.
     */
    private boolean toasted;
    /**
     * temperature value.
     */
    private int temperature;
    /**
     * toast temperature value.
     */
    private int toastTemperature = TOAST_TEMPERATURE_TEST;

    /**
     *
     * @return if the tortella is toasted.
     */
    public final boolean isToasted() {
        return this.toasted;
    }

    /**
     *
     * @return el valor actual de la temperatura.
     */

    public final int getToastTemperature() {
        return this.toastTemperature;
    }

    /**
     *
     * @return el valor de la temperatura
     */

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @param temp to set temperature.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param toastedValue para setear si la tortilla se tostó.
     */
    public void toast(final boolean toastedValue) {
        this.toasted = toastedValue;
    }
}
