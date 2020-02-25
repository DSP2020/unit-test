package mx.iteso.ut;
public interface Queso {
    /**
     * Metodo.
     * @return valor melted.
     */
     boolean isMelted();
    /**
     * Metodo.
     * @return valor current temp.
     */
     int getCurrentTemperature();
    /**
     * Metodo.
     * @return valor melting temp.
     */
     int getMeltingTemperature();
    /**
     * Metodo.
     * @param temp es una variable.
     */
     void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param melted es una variable.
     */
     void melt(boolean melted);
}
