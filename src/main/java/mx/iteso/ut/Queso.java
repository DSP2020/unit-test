package mx.iteso.ut;
/** Represents an Queso.
 * @author Angel
 * @version 1.0
 * @since 1.0
*/
public interface Queso {
	/**
     * variable melted.
	 * @return melted
     */
    public boolean isMelted();
	/**
     * Mwthod getCurrentTemperature.
	 * @return temperature
     */
    public int getCurrentTemperature();
	/**
     * Mwthod getMeltingTemperature.
	 * @return meltedd
     */
    public int getMeltingTemperature();
	/**
	 *@param temp setCurrentTemperature.
     */
    public void setCurrentTemperature(final int temp);
	/**
	 *@param melted melt.
     */
    public void melt(final boolean melted);
}
