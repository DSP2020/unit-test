package mx.iteso.ut;
public class QuesoManchego implements Queso {
    /**
     * Variable v o f.
     */
   private boolean melted;
    /**
     * Variable entera.
     */
    private int temperature;
    /**
     * Variable entera.
     */
   private final int melting = 20;
    /**
     * Metodo.
     * @return valor melted.
     */
    public final boolean isMelted() {
        return this.melted;
    }
    /**
     * Metodo.
     * @return valor current temp.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Metodo.
     * @return valor melting temp.
     */
    public final int getMeltingTemperature() {
        return this.melting;
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
     * @param melt es una variable.
     */
    public final void melt(final boolean melt) {
        this.melted = melt;

    }
}
