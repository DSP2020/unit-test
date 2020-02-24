package mx.iteso.ut;
/**
 * QuesoChihuahua!
 *
 */
public class QuesoChihuahua implements Queso {
    /**
     * T!
     */
    public static final int T = 20;
    /**
     * melted!
     */
    private boolean melted;
    /**
     * temperature!
     */
    private int temperature;
    /**
     * melting!
     *
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
     * kaad
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * melt!
     * @param m
     * akkdk
     */
    public void melt(final boolean m) {
        this.melted = m;
    }
}
