package mx.iteso.ut;
/**

 * En esta interfaz  define el  tipo de queso.

 * @author: Frank De La Torre

 * @version: 24/02/2019

 */
public interface Queso {
    /**

     * En esta función define si esta derretido.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si derretido

     */
     boolean isMelted();

    /**

     * En esta función define la temperatura actual.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura actual

     */
     int getCurrentTemperature();

    /**

     * En esta función define la temperatura para derretir.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura de derretido

     */
     int getMeltingTemperature();

    /**

     * En esta función establece la temperatura actual .

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param temp actual

     */
     void setCurrentTemperature(int temp);

    /**

     * En esta función es para derretir el queso.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param melted boleano si esta derretido

     */
     void melt(boolean melted);
}
