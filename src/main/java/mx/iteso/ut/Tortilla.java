package mx.iteso.ut;
/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong.
 * @version: 21/02/2020
*/
public interface Tortilla {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    boolean isToasted();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    int getToastTemperature();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    int getCurrentTemperature();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param temp El parámetro numeroItems define el número de elementos que
    */
    void setCurrentTemperature(int temp);
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param toasted El parámetro numeroItems define el número de elementos que
    */
    void toast(boolean toasted);

}
