package mx.iteso.ut;

/**
 * Clase TortillaHarina derivada de Tortilla.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public class TortillaHarina implements Tortilla {
    /**
     * Variable global.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private boolean toasted;
    /**
     * Variable global.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private int temperature;
    /**
     * Variable global.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private final int toasting = 15;

    /**
     * Método para obtener valor.
     * @return el valor de tostado
     */
    public boolean isToasted() {
        return this.toasted;
    }
    /**
     * Método para obtener valor.
     * @return el valor de temperatura
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * Método para obtener valor.
     * @return el valor de temperatura
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Método para asignar valor.
     * @param  ctemp asigna si la temperatura
     */
    public void setCurrentTemperature(final int ctemp) {
        this.temperature = ctemp;
    }

    /**
     * Método para asignar valor.
     * @param  ctoasted asigna si esta tostado
     */
    public void toast(final boolean ctoasted) {
        this.toasted = ctoasted;
    }
}
