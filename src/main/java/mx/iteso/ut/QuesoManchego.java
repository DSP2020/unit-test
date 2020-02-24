package mx.iteso.ut;

/**
 * Queso Manchego.
 */
public class QuesoManchego implements Queso {

    /**
     * Se derrite.
     */
    private boolean melted;
    /**
     * Temperatura.
     */
    private int temperature;
    /**
     * Temperatura de derretido.
     */
    private int melting;

    /**
     * Se derrite.
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Retorna la temperatura.
     * @return temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Regresa la temperatura de derretido.
     * @return temperatura de derretido.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Establece la temperatura.
     * @param temp temperatura.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Se derrite.
     * @param melt se derrite.
     */
    public void melt(final boolean melt) {
        this.melted = melt;
    }
}
