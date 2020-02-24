package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public class QuesoManchego implements Queso {
    /**
     */
    private int temp;

    /**
     */
    private final int tempToMelt = 90;

    /**
     */
    private boolean melted;

    /**
     * @return boolean
     */
    public final boolean isMelted() {
        return melted;
    }

    /**
     * @return int
     */
    public final int getCurrentTemperature() {
        return temp;
    }

    /**
     * @return int
     */
    public final int getMeltingTemperature() {
        return tempToMelt;
    }

    /**
     * @param t
     * temperature
     */
    public final void setCurrentTemperature(final int t) {
this.temp = t;
    }

    /**
     * @param m
     * melt
     */
    public final void melt(final boolean m) {
this.melted = m;
    }
}
