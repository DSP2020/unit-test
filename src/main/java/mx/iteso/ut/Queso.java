package mx.iteso.ut;

/**
 * Interface que ofrece los métodos para cualquier queso.
 */
public interface Queso {
    /**
     * Regresa si el queso está derretido.
     * @return true si sí, false si no.
     */
    boolean isMelted();

    /**
     * Obtiene la temperatura.
     * @return temperature
     */
    int getCurrentTemperature();

    /**
     * Obtiene la temperatura a la que se derrite.
     * @return la temperatura a la que se derrite
     */
    int getMeltingTemperature();

    /**
     * Setea la nueva temperatura.
     * @param newTemp la nueva temperatura.
     */
    void setCurrentTemperature(int newTemp);

    /**
     * Setea si está derretido.
     * @param melted true si lo está, false si no.
     */
    void melt(boolean melted);
}
