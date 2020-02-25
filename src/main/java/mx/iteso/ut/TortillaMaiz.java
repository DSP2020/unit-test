package mx.iteso.ut;
/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong.
 * @version: 21/02/2020
*/
public class TortillaMaiz implements Tortilla {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    static final int TOASTING_TEMPERATURE = 20;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private boolean toasted;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private int temperature;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private int toasting = TOASTING_TEMPERATURE;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public boolean isToasted() {
        return this.toasted;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public int getToastTemperature() {
        return this.toasting;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param temp El parámetro numeroItems define el número de elementos que va
    *a tener la serie aleatoria
    */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param toastedParam El parámetro numeroItems define el número de elementos
    *que va
    *a tener la serie aleatoria
    */
    public void toast(final boolean toastedParam) {
        this.toasted = toastedParam;
    }
}
