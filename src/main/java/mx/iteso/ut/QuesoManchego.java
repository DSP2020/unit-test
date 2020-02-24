package mx.iteso.ut;
/**
 * QuesoManchego!
 *
 */
public class QuesoManchego implements Queso {
    /**
     * T!
     */
    public static final int T = 20;
    /**
     * melded!
     */
    private boolean melted;
    /**
     * temperature!
     */
    private int temperature;
    /**
     * melting!
     */
    private int melting = T;
    /**
     * isMelted!
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }
    /**
     * getCurrentTemperature!
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * getMeltingTemperature!
     * @return int
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
    /**
     * setCurrentTemperature!
     * @param temp
     * djajd
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * melt!
     * @param m
     * kdkd
     */
    public void melt(final boolean m) {
        this.melted = m;
    }
}
