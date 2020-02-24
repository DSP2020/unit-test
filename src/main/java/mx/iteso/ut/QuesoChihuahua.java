package mx.iteso.ut;

public class QuesoChihuahua implements Queso {
    /**
     * Melt.
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
     * Return isMelted.
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }
    /**
     * Get temp.
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * Get melt.
     * @return int
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
    /**
     * set Temp.
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
