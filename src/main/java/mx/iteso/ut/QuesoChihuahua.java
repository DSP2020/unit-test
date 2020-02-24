package mx.iteso.ut;

/**
 * Clase QuesoChihuahua derivada de Queso.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public class QuesoChihuahua implements Queso {

    /**
     * Instancia de la clase queso.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private boolean melted;
    /**
     * Instancia de la clase queso.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private int temperature;
    /**
     * Instancia de la clase queso.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private final int melting = 20;

    /**
     * Método para obtener valor.
     * @return el si esta o no derretido
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Método para obtener la temperatura.
     * @return el valor de temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Método para obtener la temperatura.
     * @return el valor de derretido
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Método para asignar valor.
     * @param ctemp asigna la temperatura
     */
    public void setCurrentTemperature(final int ctemp) {
        this.temperature = ctemp;
    }

    /**
     * Método para asignar valor.
     * @param  cmelted asigna si esta derretido
     */
    public void melt(final boolean cmelted) {
        this.melted = cmelted;
    }
}
