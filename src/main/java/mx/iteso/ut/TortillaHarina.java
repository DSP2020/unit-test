package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    /**
     * Variable f o v.
     */
   private boolean toast;
    /**
     * Variable entera.
     */
    private int temperature;
    /**
     * Variable.
     */
    private final int tosted = 20;
    /**
     * Metodo.
     * @return valor toasted.
     */
    public final boolean isToasted() {
        return this.toast;
    }

    /**
     * Metodo.
     * @return valor toasting temp.
     */
    public final int getToastTemperature() {
        return this.tosted;
    }
    /**
     * Metodo.
     * @return valor temperature.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @param temp es una variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * Metodo.
     * @param toasted es una variable.
     */
    public final void toast(final boolean toasted) {
        this.toast = toasted;
    }
}
