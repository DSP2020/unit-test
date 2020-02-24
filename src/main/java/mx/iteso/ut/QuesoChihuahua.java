package mx.iteso.ut;

/**
 * Class for implementing Queso.
 */
public class QuesoChihuahua implements Queso {

    /**
     * Initial value.
     */
    private static final int INITIALVALUE = 20;

    /**
     * @param boolean for melting.
     */
    private boolean melted;

    /**
     * @param temperature for heat level.
     */
    private int temperature;

    /**
     * @param melting for melt.
     */
    private int melting = INITIALVALUE;

    /**
     *
     * @return boolean for saying if its metlted or not.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return int to get current temp.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return int to get melting.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp for setting current temperature.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param melti for melt.
     */
    public void melt(final boolean melti) {
        this.melted = melti;
    }
}
