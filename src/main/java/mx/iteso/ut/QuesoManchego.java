package mx.iteso.ut;

/**
 * Clase QuesoManchego derivada de Queso.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public class QuesoManchego implements Queso {
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
    private final int melting = 15;

    /**
     * Método para obtener la temperatura.
     * @return el valor de temperatura
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
     * @return el valor de asado
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Método para obtener la temperatura.
     * @param ctemp el valor de temperatura
     */
    public void setCurrentTemperature(final int ctemp) {
        this.temperature = ctemp;
    }

    /**
     * Método para obtener la temperatura.
     * @param cMelted el valor de derretido
     */
    public void melt(final boolean cMelted) {
        this.melted = cMelted;
    }
}
