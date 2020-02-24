package mx.iteso.ut;

/**
 * Interfaz queso.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public interface Queso {
    /**
     * Metodos de la interface.
     * @return temperatura derretido
     */
    boolean isMelted();
    /**
     * Metodos de la interface.
     * @return temperatura ambiente
     */
    int getCurrentTemperature();
    /**
     * Metodos de la interface.
     * @return temperatura de derretimiento
     */
    int getMeltingTemperature();
    /**
     * Metodos de la interface.
     * @param temp recibe una variable entera del temp.
     */
    void setCurrentTemperature(int temp);
    /**
     * Metodos de la interface.
     * @param melted recibe un boolean.
     */
    void melt(boolean melted);
}
