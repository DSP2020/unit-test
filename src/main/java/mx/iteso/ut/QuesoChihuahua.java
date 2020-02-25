package mx.iteso.ut;

/**
 * clase que implementa la interface queso.
 */
public class QuesoChihuahua implements Queso {
    /**
     * valor de prueba para la variable melting.
     */
    static final int MELTING_TEST = 20;
    /**
     * es un booleano que permite saber si el queso se ha derretido.
     */
    private boolean melted;
    /**
     * temperatura del queso.
     */
    private int temperature;
    /**
     * es el valor en el cual se derrite el queso.
     */
    private int melting = MELTING_TEST;

    /**
     *
     * @return la temperatura de derritimiento del queso.
     */

    public final boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return la temperatura actual
     */

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return la temperatura de derretimiento
     */

    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp to set temperature
     */

    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param meltedValue to set melted
     */

    public void melt(final boolean meltedValue) {
        this.melted = meltedValue;
    }
}
