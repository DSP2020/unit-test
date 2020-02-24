package mx.iteso.ut;

/**
 * Hello world!
 *
 */

public class Quesadilla {
    /**
     * variable.
     */
    private Queso queso;
    /**
     * variable.
     */
    private Tortilla tortilla;
    /**
     * variable.
     */
    private Tortilla tortilla2;
    /**
     * variable.
     */
    private int heatLevel;

    /**
     * @return null
     */
    public String prepareSingle() {


     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(getTortilla()
                 .getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
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
     * @return null
     */
    public String prepareDouble() {
        //duda
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());
            //added
            getTortilla2().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            //added
            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla2().toast(true);
            }

            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if (getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "Super crunchy";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && getQueso().isMelted()) {
            return "Half crunchy";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if (!getTortilla().isToasted()
                && getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "Crunchy";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if (!getTortilla().isToasted()
                && !getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "No gas";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (!getTortilla().isToasted()
                && !getTortilla().isToasted()
                && getQueso().isMelted()) {
            return "Buenaza";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (getTortilla().isToasted()
                && getTortilla2().isToasted()
                && !getQueso().isMelted()) {
            return "Mala";
        }
        return "Error";
    }

    /**
     * @return queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param varQueso var
     */

    public void setQueso(final Queso varQueso) {
        this.queso = varQueso;
    }

    /**
     *@return tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * @return tortilla2
     */
    public Tortilla getTortilla2() {
        return  tortilla2;
    }

    /**
     *@param varTortilla var
     */
    public void setTortilla(final Tortilla varTortilla) {
        this.tortilla = varTortilla;
    }

    /**
     *@param varTortilla2 var
     */
    public void setTortilla2(final Tortilla varTortilla2) {
        this.tortilla2 = varTortilla2;
    }

    /**
     *@return heatLevel
     */

    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     *@param varHeatLevel var
     */
    public void setHeatLevel(final int varHeatLevel) {
        this.heatLevel = varHeatLevel;
    }
}
