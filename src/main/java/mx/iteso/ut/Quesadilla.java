package mx.iteso.ut;

/**
 * Quesadilla!
 *
 */
public class Quesadilla {
    /**
     * Queso!
     *
     */
    private Queso queso;
    /**
     * Tortilla1!
     *
     */
    private Tortilla tortilla;
    /**
     * Tortilla2!
     *
     */
    private Tortilla tortilla2;
    /**
     * Heat Level!
     *
     */
    private int heatLevel;

    /**
     * prepareSingle.
     * @return String
     */
    public String prepareSingle() {

     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
                 getTortilla().setCurrentTemperature(getTortilla()
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
     * prepareDouble.
     * @return String
     */

    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
                    getTortilla().setCurrentTemperature(getTortilla()
                            .getCurrentTemperature() + getHeatLevel());
                    getTortilla2().setCurrentTemperature(getTortilla2()
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
            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
        }

        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if (getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "caso1";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "caso2";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "caso3";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if (!getTortilla().isToasted()
                && !getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "caso4";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (!getTortilla().isToasted()
                && !getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "caso5";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (getTortilla().isToasted()
                && getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "caso6";
        } else {
            return "caso default";
        }
    }
    /**
     * getQueso.
     * @return Queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * setQueso.
     * @param q
     * hahash.
     */
    public void setQueso(final Queso q) {
        this.queso = q;
    }
    /**
     * getTortilla.
     * @return Tortilla
     */
    public Tortilla getTortilla() {
        return this.tortilla;
    }
    /**
     * setTortilla.
     * @param t
     * hahash.
     */
    public void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }
    /**
     * getTortilla2.
     * @return Tortilla
     */
    public Tortilla getTortilla2() {
        return this.tortilla2;
    }
    /**
     * setTortilla2.
     * @param t
     * hahash.
     */
    public void setTortilla2(final Tortilla t) {
        this.tortilla2 = t;
    }
    /**
     * getHeatLevel.
     * @return int
     */
    public int getHeatLevel() {
        return heatLevel;
    }
    /**
     * setHeatLevel.
     * @param h
     * hahash.
     */
    public void setHeatLevel(final int h) {
        this.heatLevel = h;
    }
}
