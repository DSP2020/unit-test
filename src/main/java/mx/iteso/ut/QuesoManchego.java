package mx.iteso.ut;

/**
 * @author 707899
 */
public class QuesoManchego implements Queso {
    /**
     * boolean melted.
     */
    private boolean melted = false;
    /**
     * temperature int.
     */
    private int temperature;
    /**
     * melting int.
     */
    private int melting; //20

    /**
     * method.
     */
    public QuesoManchego() {
    }

    /**
     *
     * @return melted
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return temperature var
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return melting var
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
