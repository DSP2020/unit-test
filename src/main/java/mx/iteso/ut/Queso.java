package mx.iteso.ut;

/**
 * Interface para describir el comportamieto de un queso.
 */
interface Queso {
    /**
     * Estado del queso.
     * @return Verdadero si el queso está derretido.
     */
    boolean isMelted();
    /**
     * Obtiene la temperatura actual del queso.
     * @return La temperatura actual del queso.
     */
    int getCurrentTemperature();
    /**
     * Obtiene la temeratura de derretimiento del queso.
     * @return La temperatura de derretimiento del queso.
     */
    int getMeltingTemperature();
    /**
     * Establece la temperatura actual del queso.
     * @param temp La temperatura actual del queso.
     */
    void setCurrentTemperature(int temp);
    /**
     * Derrite el queso.
     * @param melted bandera de queso derretido.
     */
    void melt(boolean melted);
}
