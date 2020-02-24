package mx.iteso.ut;
/**

 * En esta interfaz  define el  tipo de queso Manchego.

 * @author: Frank De La Torre

 * @version: 24/02/2019

 */
public class QuesoManchego implements Queso {
    /**

     * En esta variable define si esta derretido.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si derretido

     */
    private boolean melted;

    /**

     * En esta variable define si la temperatura.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si derretido

     */
    private int temperature;
    /**

     * En esta variable define el punto de derretido.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si derretido

     */
    private final int melting = 15;

    /**

     * En esta función define si esta derretido.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return boleano si derretido

     */

    public boolean isMelted() {
        return this.melted;
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

     * En esta función define la temperatura para derretir.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return temperatura de derretido

     */

    public int getMeltingTemperature() {
        return this.melting;
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

     * En esta función es para derretir el queso.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param nmelted boleano si esta derretido

     */

    public void melt(final boolean nmelted) {
        this.melted = nmelted; }
}
