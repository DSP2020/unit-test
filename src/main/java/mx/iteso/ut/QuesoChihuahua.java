package mx.iteso.ut;
public class QuesoChihuahua implements Queso {
    /**
     * Variable f o v.
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
     * @return  valor melted.
     */
    public final boolean isMelted() {
        return this.melted;
    }
    /**
     * Metodo.
     * @return  valor current temp.
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
     * @param m es una variable.
     */
    public final void melt(final boolean m) {
        this.melted = m;

    }
}
