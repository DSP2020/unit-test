package mx.iteso.ut;

public class QuesoManchego implements Queso {
    /**
     * Melted.
     */
    private boolean melted;
    /**
     * Temp.
     */
    private int temperature;
    /**
     * Melting.
     */
    private final int melting = 20;

    /**
     * Is melted.
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }
    /**
     * get temp.
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * get melting.
     * @return int
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
    /**
     * set temp.
     * @param temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * set melt.
     * @param mmelted
     */
    public void melt(final boolean mmelted) {
        this.melted = mmelted;
    }
}
