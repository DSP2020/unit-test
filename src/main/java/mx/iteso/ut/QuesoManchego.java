package mx.iteso.ut;

/**
 * Clase que define a QuesoManchego.
 */
public class QuesoManchego implements Queso {

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
     * @return Retorna si el queso esta derretido o no.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return Retorna la temperatura de la quesadilla
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return Retorna la temperatura a la que se derrite el queso.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp Representa la temperatura actual de la quesadilla.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param receivedMelted Derrite la quesadilla.
     */
    public void melt(final boolean receivedMelted) {
        this.melted = receivedMelted;
    }
}
