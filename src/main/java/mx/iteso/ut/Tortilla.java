package mx.iteso.ut;
/**

 * En esta interfaz define la información de la tortilla .

 * @author: Frank De La Torre

 * @version: 24/02/2019

 */
public interface Tortilla {
    /**

     * En esta función define si esta tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si tostado

     */
     boolean isToasted();
    /**

     * En esta función define la temperatura de tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura de tostado

     */

     int getToastTemperature();
    /**

     * En esta función define la temperatura actual.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura actual

     */
     int getCurrentTemperature();
    /**

     * En esta función establece la temperatura actual .

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param temp actual

     */
     void setCurrentTemperature(int temp);
    /**

     * En esta función es para tostar la tortilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param toasted boleano si esta derretido

     */
     void toast(boolean toasted);

}
