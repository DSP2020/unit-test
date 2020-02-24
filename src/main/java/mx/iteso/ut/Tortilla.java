package mx.iteso.ut;

/**
 * Interfaz Tortilla.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public interface Tortilla {
    /**
     * Metodos de la interface.
     * @return valida si es tostado
     */
    boolean isToasted();
    /**
     * Metodos de la interface.
     * @return temperatura tostado.
     */
    int getToastTemperature();
    /**
     * Metodos de la interface.
     * @return temperatura derretido
     */
    int getCurrentTemperature();
    /**
     * Metodos de la interface.
     * @param temp recibe una variable entera del temp.
     */
    void setCurrentTemperature(int temp);
    /**
     * Metodos de la interface.
     * @param toasted recibe un valor boolean de tostado.
     */
    void toast(boolean toasted);

}
