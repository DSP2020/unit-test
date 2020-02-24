package mx.iteso.ut;

/**
 * Clase para los quesos chihuahua.
 */
public class QuesoChihuahua implements Queso {

    /**
     * Booleano que representa si está repetido.
     */
    private boolean melted;

    /**
     * La temperatura en la que está el queso.
     */
    private int temperature;

    /**
     * Temperatura en la que se derrite.
     */
    private final int melting = 20;

    /**
     * Regresa si el queso está derretido.
     * @return true si el queso está derretido, false si no
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Regresa la temperatura actual.
     * @return int con la temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Regresa la temperatura a la que se derrite este queso.
     * @return int con la temperatura a la que se derrite
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Actualiza la temperatura actual.
     * @param newTemp la nueva temperatura
     */
    public void setCurrentTemperature(final int newTemp) {
        this.temperature = newTemp;
    }

    /**
     * Actualiza si el queso está derretido.
     * @param newMelted true si está derretido false si no
     */
    public void melt(final boolean newMelted) {
        this.melted = newMelted;

    }
}
