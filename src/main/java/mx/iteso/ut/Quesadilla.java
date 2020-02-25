package mx.iteso.ut;
/** Clase que sirve para hacer Quesadillas. */
public class Quesadilla {

    /**Objeto de tipo queso. */
    private Queso queso;
    /**Objeto de tipo tortilla. */
    private Tortilla tortilla;
    /**Variable de nivel de calor. */
    private int heatLevel;

/** JavaDoc que explica como hacerlo de forma segura.
 * @return Un string diciendo que tan chida te quedo la quesadilla.
*/
    public String prepareSingle() {

        final int maxCounter = 100;
        int counter = 0;

     while (getQueso().getCurrentTemperature()
     < getQueso().getMeltingTemperature()
     && getTortilla().getCurrentTemperature()
     < getTortilla().getToastTemperature()) {

        getTortilla().setCurrentTemperature(
            getTortilla().getCurrentTemperature() + getHeatLevel());
        getQueso().setCurrentTemperature(
            getQueso().getCurrentTemperature() + getHeatLevel());

         if (getTortilla().getCurrentTemperature()
         >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
            }
         if (getQueso().getCurrentTemperature()
         >= getQueso().getMeltingTemperature()) {
            getQueso().melt(true);
         }
         if (counter == maxCounter) {
            break;
         }

        counter++;
     }

     if (getQueso().isMelted() && getTortilla().isToasted()) {
         return "Perfect quesadilla";
     }
     if (getQueso().isMelted() && !getTortilla().isToasted()) {
         return "Good quesadilla";
     }
     if (!getQueso().isMelted() && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     } else {
        return "You ran out of gas";
     }

    }

    /** JavaDoc que explica como hacerlo de forma segura,
     *pero con la quesadilla doble.
     * @return Un string diciendo que tan chida te quedo la quesadilla doble.
     */
    public String prepareDouble() {
        /*tortilla 1 tostada, tortilla 2 tostada, queso derretido.
         * QuesadillaDoblePerfecta.
         * tortilla 1 no tostada, tortilla 2 tostada, queso derretido.
         * QuesadillaDobleMediocre.
         * tortilla 1 no tostada, tortilla 2 tostada, queso no derretido.
         * QuesadillaDobleMala.
         * tortilla 1 no tostada, tortilla 2 no tostada.
         * queso no derretido - NoHayGas2.
         * tortilla 1 no tostada, tortilla 2 no tostada, queso derretido.
         * QuesadillaDobleBuena.
         * tortilla 1 tostada, tortilla 2 tostada, queso no derretido.
         * QuesadillaDobleTerrible */

        return "";
    }

    /** Getter del queso.
    * @return el tipo de queso.
    */
    public Queso getQueso() {
        return queso;
    }

    /** Setter del Queso.
     * @param queso1
    */
    public void setQueso(final Queso queso1) {
        this.queso = queso1;
    }

    /** Getter de la tortilla.
    * @return el tipo de tortilla.
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /** Setter de la tortilla.
     * @param tortilla1
    */
    public void setTortilla(final Tortilla tortilla1) {
        this.tortilla = tortilla1;
    }

    /** Getter del calor.
    * @return cantidad de calor.
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /** Setter de la cantidad de calor.
     * @param heatLevel1
    */
    public void setHeatLevel(final int heatLevel1) {
        this.heatLevel = heatLevel1;
    }
}
