package mx.iteso.ut;

/**
 * method.
 */
public class QuesoChihuahua implements Queso {
    /**
     * melted boolean.
     */
    private boolean melted;
    /**
     * temperature int.
     */
    private int temperature;
    /**
     * melting int.
     */
    private int melting;

    /**
     *
     * @return melted
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return temperature
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return melting
     */

    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp setTemperature
     */

    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param varMelted if isMelted
     */
    public void melt(final boolean varMelted) {
        this.melted = melted;

    }
}
