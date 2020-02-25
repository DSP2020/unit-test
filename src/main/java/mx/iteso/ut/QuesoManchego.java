package mx.iteso.ut;

/**
 * implementa la interface Queso.
 */
public class QuesoManchego implements Queso {
    /**
     * testing value for melting.
     */
    static final int MELTING_TEST = 20;
    /**
     * valor booleano para saber si el queso se ha derretido.
     */
    private boolean melted;
    /**
     * temperatura actual.
     */
    private int temperature;
    /**
     * temperatura para derretir el queso.
     */
    private int melting = MELTING_TEST;

    /**
     *
     * @return si el queso se ha derretido.
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return la temperatura actual.
     */

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return la temperatura en que se derrite el queso.
     */

    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp to set temperature.
     */

    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param meltedValue si se ha derretido el queso.
     */
    public void melt(final boolean meltedValue) {
        this.melted = melted;
    }
}
