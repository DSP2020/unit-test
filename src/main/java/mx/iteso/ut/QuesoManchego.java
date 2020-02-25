package mx.iteso.ut;
/** Represents an QuesoManchego.
 * @author Angel
 * @version 1.0
 * @since 1.0
*/
public class QuesoManchego implements Queso {
	/**
     * variable melted.
     */
    private boolean melted;
	/**
     * variable temperature.
     */
    private int temperature;
	/**
     * variable melting.
     */
    private int melting = 20;
	/**
     * Mwthod isMelted.
	 *@return melted
     */
    public boolean isMelted() {
        return this.melted;
    }
	/**
     * Mwthod getCurrentTemperature.
	 *@return temperature
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
	/**
     * Mwthod getMetlringTemperature.
	 *@return melting
     */
    public int getMeltingTemperature() {
        return this.melting;
    }
	/**
	 *@param temp setCurrentTemperature.
     */
    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }
	/**
	 *@param meltedd melt.
     */
    public void melt(boolean meltedd) {
        this.melted = meltedd;
    }
}
