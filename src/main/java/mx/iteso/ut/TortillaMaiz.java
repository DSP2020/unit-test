package mx.iteso.ut;
public class TortillaMaiz implements Tortilla {
    /**
     * Variable f o v.
     */
    private boolean tost;
    /**
     * Variable entera.
     */
    private int temperature;
    /**
     * Variable entera.
     */
    private final int tosted = 20;
    /**
     * Metodo.
     * @return el valor de toasted.
     */
    public final boolean isToasted() {
        return this.tost;
    }

    /**
     * Metodo.
     * @return el valor de toasting temp.
     */
    public final int getToastTemperature() {
        return this.tosted;
    }

    /**
     * Metodo.
     * @return el valor de temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @param temp is a variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Metodo.
     * @param toasted is a variable.
     */
    public final void toast(final boolean toasted) {
        this.tost = toasted;

    }
}
