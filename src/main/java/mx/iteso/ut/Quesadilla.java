package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {

    /**
     * Cheese for quesadilla.
     */
    private Queso queso;

    /**
     * @param tortillita Set tortilla 2.
     */
    public void setTortilla2(final Tortilla tortillita) {
        this.tortilla2 = tortillita;
    }

    /**
     * Tortilla principal.
     */
    private Tortilla tortilla;

    /**
     * Tortilla 2.
     */
    private Tortilla tortilla2;

    /**
     * @return tortilla2 Get Tortilla 2.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * Heat Level.
     */
    private int heatLevel;

    /**
     * @return String Prepare single quesadilla.
     */
    public String prepareSingle() {


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
     * Method to prepare double.
     * @return String
     */
    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                || getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            if (getQueso().getCurrentTemperature()
                    < getQueso().getMeltingTemperature()
                    && getTortilla().getCurrentTemperature()
                    < getTortilla().getToastTemperature()) {
                getTortilla().setCurrentTemperature(getTortilla()
                        .getCurrentTemperature() + getHeatLevel());
            } else {
                getTortilla2().setCurrentTemperature(
                        getTortilla2().
                                getCurrentTemperature() + getHeatLevel());
            }
            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature() + getHeatLevel());
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

        if (getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "Perfect quesadilla double";
        }
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "Excelent quesadilla double";
        }
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "Good quesadilla double";
        }
        if (!getTortilla().isToasted()
                && !getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "Fine quesadilla double";
        }
        if (!getTortilla().isToasted()
                && !getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "Bad quesadilla double";
        } else {
            return "Terrible quesadilla double";
        }

    }

    /**
     * @return queso Method to get Queso.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * @param quesito set Queso to cheese.
     */
    public void setQueso(final Queso quesito) {
        this.queso = quesito;
    }

    /**
     * get Tortilla.
     * @return tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * @param tortillita set tortilla.
     */
    public void setTortilla(final Tortilla tortillita) {
        this.tortilla = tortillita;
    }

    /**
     * get heat level.
     * @return heatLevel
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * @param heatLevelito set heatLevel.
     */
    public void setHeatLevel(final int heatLevelito) {
        this.heatLevel = heatLevelito;
    }
}
