package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
    * Es el queso de la quesadilla.
     * */
    private Queso queso;
    /**
     * Es la primer tortilla de la quesadilla.
     */
    private Tortilla tortilla;
    /**
    *Es la segunda tortilla de la quesadilla.
     */
    private Tortilla tortilla2;
    /**
     *Es el heatLevel de la tortilla.
     */
    private int heatLevel;

    /**
     *
     * @return una cadena que dice como quedo la quesadilla
     */
    public final String prepareSingle() {

     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
         getTortilla()
                 .setCurrentTemperature(getTortilla()
                         .getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso()
                 .getCurrentTemperature() + getHeatLevel());
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
     *
     * @return una cadena que dice como quedo la quesadilla doble
     */
    public final String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla()
                    .setCurrentTemperature(
                            getTortilla().getCurrentTemperature()
                                    + getHeatLevel());

            getTortilla2().
                    setCurrentTemperature(
                            getTortilla2().getCurrentTemperature()
                                    + getHeatLevel());

            getQueso().
                    setCurrentTemperature(
                            getQueso().getCurrentTemperature()
                                    + getHeatLevel());

            if (getTortilla().getCurrentTemperature()
                    >=
                    getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }

            if (getTortilla2().getCurrentTemperature()
                    >=
                    getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }

            if (getQueso().getCurrentTemperature()
                    >=
                    getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }

        if ((getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted())
                ||
                (getQueso().isMelted()
                        && getTortilla().isToasted()
                        && !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }

        if (!getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        } else if ((!getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted())
                ||
                (!getQueso().isMelted()
                        && getTortilla().isToasted()
                        && !getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else if (!getQueso().isMelted()
                && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "You ran out of gas";
        } else {
            return "";
        }
    }

    /**
     *
     * @return el queso de la quesadilla
     */

    public final Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param q let
     */
    public void setQueso(final Queso q) {
        this.queso = q;
    }

    /**
     *
     * @return la tortilla de la quesadilla
     */

    public final Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @return la segunda torilla de la quesadilla
     */
    public final Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     *
     * @param t es la tortilla
     */

    public void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
     *
     * @param t2 es la tortilla2
     */
    public void setTortilla2(final Tortilla t2) {
        this.tortilla2 = t2;
    }

    /**
     *
     * @return el nivel para derretir el queso
     */

    public final int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param hl es el grado para derretir el queso
     */

    public void setHeatLevel(final int hl) {
        this.heatLevel = hl;
    }
}
