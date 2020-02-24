package mx.iteso.ut;

/**
 * Clase que implementa a queso para crear QuesoChihuahua.
 */
public class QuesoChihuahua implements Queso {

    /**
     * Guarda true o false dependiendo de si el queso esta derretido.
     */
    private boolean melted;

    /**
     * Guarda la temperatura del queso.
     */
    private int temperature;

    /**
     * Guarda la temperatura en la que se derrite el queso.
     */
    private final int melting = 20;

    /**
     *
     * @return Devuelve true o false dependiendo de si el queso esta derretido.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return Devuelve la temperatura del quesoChihuahua.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return Devuelve la temperatura a la que se derrite el queso.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param receivedTemp Recibe la temperatura a la que estara la quesadilla
     */
    public void setCurrentTemperature(final int receivedTemp) {
        this.temperature = receivedTemp;
    }

    /**
     *
     * @param receivedMelted Derrite la quesadilla.
     */
    public void melt(final boolean receivedMelted) {
        this.melted = receivedMelted;

    }
}
