package mx.iteso.ut;
/** Represents an Tortilla
 * @author Angel
 * @version 1.0
 * @since 1.0
*/
public class TortillaHarina implements Tortilla {
	/**
     * variable toasted.
     */
	private boolean toasted;
	/**
     * variable temperature.
     */
	private int temperature;
	/**
     * variable toast.
     */
	private int toast = 20;
	/**
     * Mwthod isToasted.
	 *@return toasted
     */
    public boolean isToasted() {
        return this.toasted;
    }
	/**
     * Mwthod getToastTemperature.
	 *@return temperature
     */
    public int getToastTemperature() {
        return this.temperature;
    }
	/**
     * Mwthod getCurrentTemperature.
	 *@return toast
     */
    public int getCurrentTemperature() {
        return this.toast;
    }
	/**
	 *@param temp setCurrentTemperature.
     */
    public void setCurrentTemperature(final int temp) {
		this.toast = temp;
    }
	/**
	 *@param toastedd toast.
     */
    public void toast(final boolean toastedd) {
		this.toasted = toastedd;
    }
}
