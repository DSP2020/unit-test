package mx.iteso.ut;
/** Represents an Tortilla
 * @author Angel
 * @version 1.0
 * @since 1.0
*/
public interface Tortilla {
/**
     * Mwthod isToasted.
	 *@return toasted
     */
    public boolean isToasted();
	/**
     * Mwthod getToastTemperature.
	 *@return temperature
     */
    public int getToastTemperature();
	/**
     * Mwthod getCurrentTemperature.
	 *@return toast
     */
    public int getCurrentTemperature();
	/**
	 *@param temp setCurrentTemperature.
     */
    public void setCurrentTemperature(final int temp);
	/**
	 *@param toasted toast.
     */
    public void toast(final boolean toasted);

}
