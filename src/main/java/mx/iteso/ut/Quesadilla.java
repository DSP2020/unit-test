package mx.iteso.ut;

/**
 * Clase quesadilla.
 * @author: Juan Carlos Ortiz Pinto
 * @version: 24/02/2020/1.1
 */
public class Quesadilla {
    /**
     * Instancia de la clase queso.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private Queso queso;
    /**
     * Instancia de la clase tortilla.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private Tortilla tortilla;
    /**
     * Variable entera para definir los niveles de calor.
     * @author: Juan Carlos Ortiz Pinto
     * @version: 24/02/2020/1.1
     */
    private int heatLevel;
    /**
     * Variables globales.
     * @param MaxIterations variable que define el numero maximo de iteraciones.
     */
    private final int maxIterations = 100;
    /**
     * Método para habilitar las opciones de prepara una quesadilla simple.
     * @return el string con el status final de la quesadilla
     */
    public String prepareSingle() {

        int count = 0;
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
         if (count == maxIterations) {
             break;
         }

         count++;
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

    /**
     * Método para generar quesadillas dobles.
     * @return nada
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
     * Método para habilitar las opciones de prepara una quesadilla simple.
     * @return el string con el status final de la quesadilla
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Método para asignar valor.
     * @param cQueso Recibe el entero para asignar a
     *               la variable correspondientes
     */
    public void setQueso(final Queso cQueso) {
        this.queso = cQueso;
    }

    /**
     * Método para obtener valor.
     * @return el valor de la variable heatLevel
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Método para asignar valor.
     * @param cTortilla Recibe el entero para asignar
     *                  a la variable correspondientes
     */
    public void setTortilla(final Tortilla cTortilla) {
        this.tortilla = cTortilla;
    }

    /**
     * Método para obtener valor.
     * @return el valor de la variable heatLevel
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Método para asignar valor.
     * @param cHeatLevel Recibe el entero para asignar
     *                   a la variable correspondientes
     */
    public void setHeatLevel(final int cHeatLevel) {
        this.heatLevel = cHeatLevel;
    }
}
