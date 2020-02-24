package mx.iteso.ut;

/**
 * Interfaz para las tortillas.
 */
public interface Tortilla {
    /**
     * Método para saber si la tortilla está tostada.
     * @return true si sí lo está, false si no.
     */
    boolean isToasted();

    /**
     * Obtener la temperatura a la que se tosta la tortilla.
     * @return int con la temperatura.
     */
    int getToastTemperature();

    /**
     * Obtener la temperatura actual de la tortilla.
     * @return int con la temperatura.
     */
    int getCurrentTemperature();

    /**
     * Setear la temperatura de la tortilla.
     * @param newTemp la nueva temperatura.
     */
    void setCurrentTemperature(int newTemp);

    /**
     * Setear si la tortilla se tostó.
     * @param newToasted true si está tostada, false si no.
     */
    void toast(boolean newToasted);

}
