package mx.iteso.ut;
/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong.
 * @version: 21/02/2020
*/
public class QuesoChihuahua implements Queso {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    static final int MELTING_TEMPERATURE = 20;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private boolean melted;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private int temperature;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private int melting = MELTING_TEMPERATURE;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public boolean isMelted() {
        return this.melted;
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
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public int getMeltingTemperature() {
        return this.melting;
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
    *@param meltedParam El parámetro numeroItems define el número de elementos
    *que va
    *a tener la serie aleatoria
    */
    public void melt(final boolean meltedParam) {
        this.melted = meltedParam;
    }
}
