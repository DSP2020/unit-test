package mx.iteso.ut;


public class QuesoChihuahua implements Queso {

    /**
     *Int value of the melting temperature.
     */
    static final int MELTING_TEMP = 20;
    /**
     * Melted boolean.
     * @return boolean
     */
    private boolean melted;
    /**
     * int value of the temperature.
     */
    private int temperature;
     /**
     * int value of the melting temperature.
     */
     private int melting = MELTING_TEMP;

    /**
     * Return isMelted.
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }
    /**
     * Método GET de la temperatura actual del queso.
     * @return valor de la temperatura.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Método GET de la temperatura en donde se derrite el queso.
     * @return El nivel de calor.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
    /**
     * Método SET de la temperatura actual.
     * @param temp temperatura a establecer.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * Método para cambiar el estado de melted.
     * @param meltedt valor boolean de melted.
     */
    public void melt(final boolean meltedt) {
        this.melted = meltedt;

    }
}
