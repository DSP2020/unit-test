package mx.iteso.ut;

/**
 * clase que implementa la inteface Tortilla.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * testing value for toastTemperature.
     */
    static final int TOAST_TEMPERATURE_TEST = 10;
    /**
     * booleano para saber si la tortilla se tostó.
     */
    private boolean toasted;
    /**
     * temperatura de la tortilla.
     */
    private int temperature;
    /**
     * toastTemperature value.
     */
    private int toastTemperature = TOAST_TEMPERATURE_TEST;

    /**
     *
     * @return if the tortella is toasted
     */
    public final boolean isToasted() {
        return this.toasted;
    }

    /**
     *
     * @return la temperatura en que la tortilla se tueste.
     */
    public final int getToastTemperature() {
        return this.toastTemperature;
    }

    /**
     *
     * @return la actual temperatura de la tortilla
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

