package mx.iteso.ut;

/**
 * Clase para las tortillas de maíz.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Booleano que representa si la tortilla está tostada.
     */
    private boolean tosted;

    /**
     * Temperatura actual.
     */
    private int currentTemperature;

    /**
     * Temperatura a la cual se tosta la tortilla.
     */
    private final int toastTemperature = 10;

    /**
     * Método para saber si la tortilla está tostada.
     * @return true si sí lo está, false si no.
     */
    public boolean isToasted() {
        return this.tosted;
    }

    /**
     * Obtener la temperatura a la que se tosta la tortilla.
     * @return int con la temperatura.
     */
    public int getToastTemperature() {
        return this.toastTemperature;
    }

    /**
     * Obtener la temperatura actual de la tortilla.
     * @return int con la temperatura.
     */
    public int getCurrentTemperature() {
        return this.currentTemperature;
    }

    /**
     * Setear la temperatura de la tortilla.
     * @param newTemp la nueva temperatura.
     */
    public void setCurrentTemperature(final int newTemp) {
        this.currentTemperature = newTemp;
    }

    /**
     * Setear si la tortilla se tostó.
     * @param newToasted true si está tostada, false si no.
     */
    public void toast(final boolean newToasted) {
        this.tosted = newToasted;
    }
}
