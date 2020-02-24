package mx.iteso.ut;

public interface Queso {
    /**
     * Melted boolean.
     * @return boolean
     */
    boolean isMelted();
    /**
     * Método GET de la temperatura actual del queso.
     * @return valor de la temperatura.
     */
    int getCurrentTemperature();
    /**
     * Método GET de la temperatura en donde se derrite el queso.
     * @return El nivel de calor.
     */
    int getMeltingTemperature();
    /**
     * Método SET de la temperatura actual.
     * @param temp temperatura a establecer.
     */
    void setCurrentTemperature(int temp);

    /**
     * Método para cambiar el estado de melted.
     * @param melted valor boolean de melted.
     */
    void melt(boolean melted);
}
