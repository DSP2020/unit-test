package mx.iteso.ut;

public interface Tortilla {
    /**
     * is toasted.
     * @return boolean
     */
    boolean isToasted();
    /**
     * Método GET de la temperatura del tostado.
     * @return int valor de la temperatura.
     */
    int getToastTemperature();
    /**
     * Método GET de la temperatura actual de la tortilla.
     * @return int
     */
    int getCurrentTemperature();
    /**
     * Método SET de la temperatura actual.
     * @param temp temperatura a establecer.
     */
    void setCurrentTemperature(int temp);
    /**
     * Método para cambiar el estado de toast.
     * @param toasted valor boolean de toasted.
     */
    void toast(boolean toasted);

}
