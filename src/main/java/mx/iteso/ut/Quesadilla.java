package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     * Queso.
     */
    private Queso queso;
    /**
     * tortilla.
     */
    private Tortilla tortilla;
    /**
     * tortilla 2.
     */
    private Tortilla tortilla2;
    /**
     * nivel de calor.
     */
    private int heatLevel;

    /**
     * Prepara quesadilla sencilla.
     * @return Estado de la quesadilla.
     */
    public String prepareSingle() {
     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
             getTortilla()
                          .setCurrentTemperature(
                                getTortilla().getCurrentTemperature()
                                + getHeatLevel());
             getQueso()
                       .setCurrentTemperature(
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
     * Prepara quesadilla doble.
     * @return Estado de la quesadilla.
     */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && (getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature())) {
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

        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad for double quesadilla but it can be single";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if (!getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad quesadilla, but you can eat one toast tortilla";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if (!getQueso().isMelted()
                && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "You ran out of gas";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (getQueso().isMelted()
                && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Fondue with tortillas";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (!getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * Get el queso.
     * @return queso.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Settea el queso.
     * @param cheese queso.
     */
    public void setQueso(final Queso cheese) {
        this.queso = cheese;
    }

    /**
     * Regresa la tortilla.
     * @return tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Regresa la tortilla dos.
     * @return tortilla.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * Settea la tortilla.
     * @param tort tortilla.
     */
    public void setTortilla(final Tortilla tort) {
        this.tortilla = tort;
    }

    /**
     * Settea la tortilla 2.
     * @param tort tortilla.
     */
    public void setTortilla2(final Tortilla tort) {
        this.tortilla2 = tort;
    }

    /**
     * Regresa el nivel de calor.
     * @return heatLevel.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Settea el nivel de calor.
     * @param level nivel.
     */
    public void setHeatLevel(final int level) {
        this.heatLevel = level;
    }
}
