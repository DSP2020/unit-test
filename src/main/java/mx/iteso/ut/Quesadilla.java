package mx.iteso.ut;
/** Represents an Quesadilla.
 * @author Angel
 * @version 1.0
 * @since 1.0
*/
public class Quesadilla {
	/**
     * Variable queso.
     */
    private Queso queso;
	/**
     * Variable tortilla.
     */
    private Tortilla tortilla;
	/**
     * Variable tortilla2.
     */
    private Tortilla tortilla2;
	/**
     * integer Variable heatLevel.
     */
    private int heatLevel;
	/**
     * Mwthod prepareSingle.
	 *@return String
     */
    public String prepareSingle() {

     while (getQueso().getCurrentTemperature()
	 < getQueso().getMeltingTemperature()
	 && getTortilla().getCurrentTemperature()
	 < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
		 getTortilla().getCurrentTemperature()
		 + getHeatLevel());
         getQueso().setCurrentTemperature(
		 getQueso().getCurrentTemperature()
		 + getHeatLevel());
         if (getTortilla().getCurrentTemperature()
		 >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
			 }
         if (getQueso().getCurrentTemperature()
		 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
			 }
     }

     if (getQueso().isMelted()
	 && getTortilla().isToasted()) {
         return "Perfect quesadilla";
		 }
     if (getQueso().isMelted()
	 && !getTortilla().isToasted()) {
         return "Good quesadilla";
		 }
     if (!getQueso().isMelted()
	 && getTortilla().isToasted()) {
         return "Terrible quesadilla";
		 }
     else {
         return "You ran out of gas";
		 }

    }
	/**
     * Mwthod prepareDouble.
	 *@return String
     */
    public String prepareDouble() {
     while (getQueso().getCurrentTemperature()
	 < getQueso().getMeltingTemperature()
	 && getTortilla().getCurrentTemperature()
	 < getTortilla().getToastTemperature()
	 && getTortilla2().getCurrentTemperature()
	 < getTortilla2().getToastTemperature()) {
        getTortilla().setCurrentTemperature(
		getTortilla().getCurrentTemperature()
		+ getHeatLevel());
		getTortilla2().setCurrentTemperature(
		getTortilla2().getCurrentTemperature()
		+ getHeatLevel());
        getQueso().setCurrentTemperature(
		getQueso().getCurrentTemperature()
		+ getHeatLevel());
         if (getTortilla().getCurrentTemperature()
		 >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
			 }
		 if (getTortilla2().getCurrentTemperature()
		 >= getTortilla2().getToastTemperature()) {
             getTortilla2().toast(true);
			 }
         if (getQueso().getCurrentTemperature()
		 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
			 }
     }
	if (getQueso().isMelted()
	&& getTortilla().isToasted()
	&& getTortilla2().isToasted()) {
         return "Perfect double quesadilla";
		 }
    if (getQueso().isMelted()
	&& !getTortilla().isToasted()
	&& getTortilla2().isToasted()) {
         return "Good double quesadilla bad one tortilla";
		 }
	if (!getQueso().isMelted()
	&& !getTortilla().isToasted()
	&& getTortilla2().isToasted()) {
         return "Bad double quesadilla bad one tortilla";
		 }
	if (!getQueso().isMelted()
	&& !getTortilla().isToasted()
	&& !getTortilla2().isToasted()) {
         return "Terrible double quesadilla";
		 }
	if (getQueso().isMelted()
	&& !getTortilla().isToasted()
	&& !getTortilla2().isToasted()) {
         return "Bad double quesadilla";
		 }
	if (!getQueso().isMelted()
	&& getTortilla().isToasted()
	&& getTortilla2().isToasted()) {
         return "Good double quesadilla";
		 }
    else {
         return "You ran out of gas double quesadilla";
		 }
    }
	/**
     * Mwthod getQueso.
	 *@return queso
     */
    public Queso getQueso() {
        return this.queso;
    }
	/**
	 *@param quesoo setQueso.
     */
    public void setQueso(final Queso quesoo) {
        this.queso = quesoo;
    }
	/**
     * Mwthod getTortilla.
	 *@return tortilla
     */
    public Tortilla getTortilla() {
        return this.tortilla;
    }
	/**
	 *@param tortillaa setTortilla.
     */
    public void setTortilla(final Tortilla tortillaa) {
        this.tortilla = tortillaa;
    }
	/**
     * Mwthod getTortilla2.
	 *@return tortilla2
     */
    public Tortilla getTortilla2() {
        return this.tortilla2;
    }
	/**
	 *@param tortillaa setTortilla2.
     */
    public void setTortilla2(final Tortilla tortillaa) {
        this.tortilla2 = tortillaa;
    }
	/**
     * Mwthod getTortilla.
	 *@return heatLevel
     */
    public int getHeatLevel() {
        return this.heatLevel;
    }
	/**
	 * @param heatLevell set Heat Level.
     */
    public void setHeatLevel(final int heatLevell) {
        this.heatLevel = heatLevell;
    }
}