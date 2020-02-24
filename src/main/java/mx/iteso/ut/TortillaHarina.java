package mx.iteso.ut;
/**

 * En esta interfaz define el tipo de la tortilla .

 * @author: Frank De La Torre

 * @version: 24/02/2019

 */
public class TortillaHarina implements Tortilla {
    /**

     * En esta variable define si esta tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private  boolean toasted;
    /**

     * En esta variable define la temperatura.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private  int temperature;
    /**

     * En esta variable define el tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private final int toasting = 15;

    /**

     * En esta función define si esta tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si tostado

     */

    public boolean isToasted() {
        return this.toasted;
    }

    /**

     * En esta función define la temperatura de tostado.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura de tostado

     */

    public int getToastTemperature() {
        return this.toasting;
    }
    /**

     * En esta función define la temperatura actual.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura actual

     */

    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**

     * En esta función establece la temperatura actual .

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param temp actual

     */

    public void setCurrentTemperature(final int temp) {
        this.temperature = temp; }
    /**

     * En esta función es para tostar la tortilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param ntoasted boleano si esta derretido

     */

    public void toast(final boolean ntoasted) {
        this.toasted = ntoasted; }
}
