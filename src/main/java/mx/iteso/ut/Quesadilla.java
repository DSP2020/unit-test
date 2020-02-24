package mx.iteso.ut;
/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**

     * En esta variable se define las propiedades del queso.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private Queso queso;
    /**

     * En esta variable se define las propiedades de la tortilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private Tortilla tortilla;
    /**

     * En esta variable se define las propiedades del calor.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private int heatLevel;

    /**

     * En esta variable se define el tope de calor.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     */
    private final int tope = 100;

    /**

     * En esta clase se define la preparación de una quesadilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return String que indica la calidad

     */
    public String prepareSingle() {

    int count = 0; //Contador para poder salir del ciclo
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
         if (count == tope) {
             break;
         }

         count++;
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
     } else {
         return "You ran out of gas";
     }


    }

    /**

     * En esta clase se define la preparación de una quesadilla doble.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return String que indica la calidad

     */

    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }

    /**

     * En esta clase se define el retorno del tipo de queso.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return String que indica el tipo

     */

    public Queso getQueso() {
        return queso;
    }

    /**

     * En esta clase se define el  tipo de queso.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param  nqueso que indica el tipo

     */

    public void setQueso(final Queso nqueso) {
        this.queso = nqueso;
    }

    /**

     * En esta clase se define el retorno del tipo de tortilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return String que indica el tipo

     */

    public Tortilla getTortilla() {
        return tortilla;
    }

    /**

     * En esta clase se define el  tipo de tortilla.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param  ntortilla que indica el tipo

     */

    public void setTortilla(final Tortilla ntortilla) {
        this.tortilla = ntortilla;
    }

    /**

     * En esta clase se define el retorno del calor.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @return String que indica el calor

     */

    public int getHeatLevel() {
        return heatLevel;
    }

    /**

     * En esta clase se define el calor.

     * @author: Frank De La Torre

     * @version: 24/02/2019

     * @param  nheatLevel que indica el nivel

     */

    public void setHeatLevel(final int nheatLevel) {
        this.heatLevel = nheatLevel;
    }
}
