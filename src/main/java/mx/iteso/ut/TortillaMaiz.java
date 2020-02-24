package mx.iteso.ut;

/**
 * Tortilla de maiz.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Tostado.
     */
    private boolean toasted;
    /**
     * Temperatura.
     */
    private int temperature;
    /**
     * Nivel de tostado.
     */
    private int toasting;

    /**
     * Se tosta.
     * @return tostado
     */
    public boolean isToasted() {
        return toasted;
    }

    /**
     * Regresa temperatura de tostado.
     * @return temperatura de tostado.
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Regresa la temperatura.
     * @return temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Set la temperatura.
     * @param temp temperatura.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Set el tostado.
     * @param toast tostado
     */
    public void toast(final boolean toast) {
        this.toasted = toast;
    }
}
