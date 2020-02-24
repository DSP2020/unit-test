package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     * Queso es el ingrediente principal de quesadilla.
     */
    private Queso queso;
    /**
     * Tortilla es el ingrediente base de quesadilla.
     */
    private Tortilla tortilla;
    /**
     * Temperatura actual de la quesadilla.
     */
    private int heatLevel;

    /**
     * Crear una nueva quesadilla.
     * @return String.
     */
    public final String prepareSingle() {

         while (getQueso().getCurrentTemperature()
                 < getQueso().getMeltingTemperature()
                 && getTortilla().getCurrentTemperature()
                 < getTortilla().getToastTemperature()) {

                     getTortilla().setCurrentTemperature(
                             getTortilla().getCurrentTemperature()
                             + getHeatLevel()
                     );

                     getQueso().setCurrentTemperature(
                             getQueso().getCurrentTemperature()
                             + getHeatLevel()
                     );

                     if (getTortilla().getCurrentTemperature()
                        >= getTortilla().getToastTemperature()) {
                            getTortilla().toast(true);
                     }

                     if (getQueso().getCurrentTemperature()
                        >= getQueso().getMeltingTemperature()) {
                            getQueso().melt(true);
                     }
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
     * Prepara dos quesadillas.
     * @return String.
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
     *Devolver el tipo de queso usado en la quesadilla.
     * @return String.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Recibe el queso que se usara para la quesadilla.
     * @param receivedQueso Este parametro indica el tipo de queso.
     */
    public void setQueso(final Queso receivedQueso) {
        this.queso = receivedQueso;
    }

    /**
     *
     * @return Devuelve el tipo de tortilla de la quesadilla.
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @param receivedTortilla Es el tipo de tortilla que usará la quesadilla.
     */
    public void setTortilla(final Tortilla receivedTortilla) {
        this.tortilla = receivedTortilla;
    }

    /**
     * Devuelve la temperatura a la que esta la quesadilla.
     * @return Temperatura de quesadilla.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param receivedHeatLevel Recibe la temperatura de la quesadilla.
     */
    public void setHeatLevel(final int receivedHeatLevel) {
        this.heatLevel = receivedHeatLevel;
    }
}
