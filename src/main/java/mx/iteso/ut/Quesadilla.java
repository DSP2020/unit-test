package mx.iteso.ut;

/**
 * Hello world!
 */
public class Quesadilla {
    /**
     *
     */
    private Queso queso;
    /**
     *
     */
    private Tortilla tortilla;
    /**
     *
     */
    private Tortilla tortilla2;
    /**
     *
     */
    private int heatLevel;

    /**
     * @return String
     */
    public String prepareSingle() {


        while (getQueso().getCurrentTemperature() < getQueso().
                getMeltingTemperature() && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().
                    getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().
                    getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().
                    getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature() >= getQueso().
                    getMeltingTemperature()) {
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
     * @return String
     */
    public String prepareDouble() {

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().
                    getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2()
                    .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                    .getCurrentTemperature() + getHeatLevel());
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
        if (getTortilla().isToasted() && getTortilla2().
                isToasted() && getQueso().isMelted()) {
            return "Combination 1 quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (!getTortilla().isToasted() && getTortilla2().
                isToasted() && getQueso().isMelted()) {
            return "Combination 2 quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if (!getTortilla().isToasted() && getTortilla2().
                isToasted() && !getQueso().isMelted()) {
            return "Combination 3 quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if (!getTortilla().isToasted() && !getTortilla2().
                isToasted() && !getQueso().isMelted()) {
            return "Combination 4 quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (!getTortilla().isToasted() && !getTortilla2().
                isToasted() && getQueso().isMelted()) {
            return "Combination 5 quesadilla";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (getTortilla().isToasted() && getTortilla2().
                isToasted() && !getQueso().isMelted()) {
            return "Combination 6 quesadilla";
        } else {
            return "You ran out of gas preparing a double";
        }
    }

    /**
     * @return Queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * @param quesoToSet
     */
    public void setQueso(final Queso quesoToSet) {
        this.queso = quesoToSet;
    }


    /**
     * @return Tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * @param tortillaToSet
     */
    public void setTortilla(final Tortilla tortillaToSet) {
        this.tortilla = tortillaToSet;
    }

    /**
     * @return Tortilla
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * @param tortillaToSet
     */
    public void setTortilla2(final Tortilla tortillaToSet) {
        this.tortilla2 = tortillaToSet;
    }

    /**
     * @return int
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * @param heatLevelToSet
     */
    public void setHeatLevel(final int heatLevelToSet) {
        this.heatLevel = heatLevelToSet;
    }
}
