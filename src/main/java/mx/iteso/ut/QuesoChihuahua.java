package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public class QuesoChihuahua implements Queso {
    /**
     */
    private boolean melted;

    /**
     */
    private int temperature;

    /**
     */
    private final int melting = 20;


    /**
     * @return boolean
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * @return int
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @return int
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * @param t
     * temperature
     */
    public final void setCurrentTemperature(final int t) {
        this.temperature = t;
    }

    /**
     * @param m
     * melt
     */
    public final void melt(final boolean m) {
        this.melted = m;
    }
}
