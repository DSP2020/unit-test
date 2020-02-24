package mx.iteso.ut;

/**
 * Implementación de una tortilla de harina.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Estado de tostado.
     */
    private boolean mToasted;
    /**
     * Temperatura actual.
     */
    private int mTemperature;
    /**
     * Temperatura de tostado.
     */
    private final int mToast = 10;

    /**
     * Regresa si una tortilla está tostada.
     * @return Verdadero si una tortilla está tostada.
     */
    public boolean isToasted() {
        return this.mToasted;
    }

    /**
     * Obtiene la temperatura de tostado.
     * @return Temperatura de tostado.
     */
    public int getToastTemperature() {
        return this.mToast;
    }

    /**
     * Obtiene la temperatura de tostado de una tortilla.
     * @return Tempertatura de tostado.
     */
    public int getCurrentTemperature() {
        return this.mTemperature;
    }

    /**
     * Establece la temperatura de tostado.
     * @param temp la nuva temperatura de tostado.
     */
    public void setCurrentTemperature(final int temp) {
        this.mTemperature = temp;
    }

    /**
     * Tosta una tortilla.
     * @param toasted Nuevo estao de tostado.
     */
    public void toast(final boolean toasted) {
        this.mToasted = toasted;
    }
}
