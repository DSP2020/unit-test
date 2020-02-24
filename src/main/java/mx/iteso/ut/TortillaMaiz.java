package mx.iteso.ut;

/**
 * Clase TortillaMaiz derivada de Tortilla.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public class TortillaMaiz implements Tortilla {
    /**
     * Variable globales.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private boolean toasted;
    /**
     * Variable globales.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private int temperature;
    /**
     * Variable globales.
     * @param toasting Recibe el valor de tostado
     */
    private final int toasting = 20;

    /**
     * Método para obtener la valor.
     * @return el valor de tostado
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     * Método para obtener valor.
     * @return el valor de temperatura de toste
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
     * @param  ctemp asigna tiempo
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
