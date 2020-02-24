/**
 *package de la práctica de unit testing.
 */
package mx.iteso.ut;

/**
 * Clase para definir el objeto Quesadilla.
 */
public class Quesadilla {
    /**
     * El queso de la Quesadilla.
     */
    private Queso queso;
    /**
     * Tortilla para la Quesadilla simple.
     */
    private Tortilla tortilla1;
    /**
     * Tortilla para la Quesadilla doble.
     */
    private Tortilla tortilla2;
    /**
     * Nivel de calor de la Quesadilla.
     */
    private int heatLevel;

    /**
     * Método para preparar una Quesadilla simple.
     * @return Mensaje de resultado, Perfect quesadilla, Good quesadilla,
     * Terrible quesadilla, You ran out of gas.
     */
    public String prepareSingle() {

     while (
             getQueso().getCurrentTemperature()
                     < getQueso().getMeltingTemperature()
                     && getTortilla1().getCurrentTemperature()
                     < getTortilla1().getToastTemperature()) {

         getTortilla1().setCurrentTemperature(
                 getTortilla1().getCurrentTemperature() + getHeatLevel()
         );
         getQueso().setCurrentTemperature(
                 getQueso().getCurrentTemperature() + getHeatLevel()
         );
         if (getTortilla1().getCurrentTemperature()
                 >= getTortilla1().getToastTemperature()) {
             getTortilla1().toast(true);
         }
         if (getQueso().getCurrentTemperature()
                 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
     }


        if (getQueso().isMelted()
                && getTortilla1().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
                && !getTortilla1().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
                && getTortilla1().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }

    /**
     * Método para preparar una Quesadilla doble.
     * @return Mensaje de resultado, Perfect quesadilla, Good quesadilla,
     * Terrible quesadilla, You ran out of gas.
     */
    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        while (
                getQueso().getCurrentTemperature()
                        < getQueso().getMeltingTemperature()
                        && getTortilla1().getCurrentTemperature()
                        < getTortilla1().getToastTemperature()
                        && getTortilla2().getCurrentTemperature()
                        < getTortilla2().getToastTemperature()) {

            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getTortilla1().getCurrentTemperature()
                    >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted()
                && getTortilla1().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
                && (!getTortilla1().isToasted()
                || !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
                && (getTortilla1().isToasted()
                || getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * Método GET del queso.
     * @return El queso.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Método Set del queso.
     * @param q el queso de la quesadilla.
     */
    public void setQueso(final Queso q) {
        this.queso = q;
    }


    /**
     * Método GET de la tortilla 1.
     * @return La tortilla 1 de la quesadilla.
     */
    public Tortilla getTortilla1() {
        return this.tortilla1;
    }

    /**
     * Método Set de la tortilla 1.
     * @param tortilla tortilla a establecer.
     */
    public void setTortilla1(final Tortilla tortilla) {
        this.tortilla1 = tortilla;
    }

    /**
     * Método GET de la tortilla 2.
     * @return la tortilla 2 de la quesadilla.
     */
    public Tortilla getTortilla2() {
        return this.tortilla2;
    }

    /**
     * Método Set de la tortilla 2.
     * @param tortilla tortilla a establecer.
     */
    public void setTortilla2(final Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    /**
     * Método GET del nivel de calor de la quesadilla.
     * @return El nivel de calor.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Método Set del nivel de calor de la quesadilla.
     * @param hl nivel de calor de la quesadilla.
     */
    public void setHeatLevel(final int hl) {
        this.heatLevel = hl;
    }
}
