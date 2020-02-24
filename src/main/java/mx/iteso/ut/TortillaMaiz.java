package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    /**
     *Int value of the toast temperature.
     */
    static final int TOAST_TEMP = 15;
    /**
     * toasted boolean value.
     */
    private boolean toasted;
    /**
     * int value of the temperature.
     */
    private int temperature;
    /**
     * int value of the toast temperature.
     */
    private int toast = TOAST_TEMP;

    /**
     * is toasted.
     * @return boolean
     */
    public boolean isToasted() {
        return this.toasted;
    }
    /**
     * Método GET de la temperatura del tostado.
     * @return int valor de la temperatura.
     */
    public int getToastTemperature() {
        return this.toast;
    }

    /**
     * Método GET de la temperatura actual de la tortilla.
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Método SET de la temperatura actual.
     * @param temp temperatura a establecer.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Método para cambiar el estado de toast.
     * @param toastedt valor boolean de toasted.
     */
    public void toast(final boolean toastedt) {
        this.toasted = toastedt;
    }
}


