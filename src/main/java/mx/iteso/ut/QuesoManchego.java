package mx.iteso.ut;

/**
 * Esta clase es queso Manchego.
 * @version: 24/02/2020
 */
public class QuesoManchego implements Queso {
//Implementacion
    /**
     * Variable.
     */
    private final int mELT = 20;
    /**
     * Variable.
     */
    private boolean melted;
    /**
     * Variable.
     */
    private int temperature;
    /**
     * Variable.
     */
    private int melting = mELT;

    /**
     * Método que devuelve si el queso esta derretido.
     * @return boleano si esta o no derretido
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * Método que devuelve el número de la temperatura.
     * @return la temperatura actua
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Método que devuelve el número de la temperatura de derretimiento.
     * @return la temperatura
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Método que le da valor a temperatura.
     * @param temp la temperatura que se le da
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Método que devuelve el valor al que se derrite el queso.
     * @param meltedNew la temperatura en la que se derretira el queso
     */
    public final void melt(final boolean meltedNew) {
        this.melted = meltedNew;
    }
}
