package mx.iteso.ut;
/**
 * Method.
 */
class Quesadilla {
    /**
     * @param queso
     */
    private Queso queso;
    /**
     * @param tortilla
     */
    private Tortilla tortilla;
    /**
     * @param tortilla2
     */
    private Tortilla tortilla2;
    /**
     * @param heatLevel
     */
    private int heatLevel;
    /**.
     * Return a single quesadilla
     * @return String
     */
    String prepareSingle() {
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

    /**.
     * Return a double quesadilla
     * @return String
     */
    String prepareDouble() {
        while (getQueso().getCurrentTemperature()
        < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(
                getTortilla2().getCurrentTemperature() + getHeatLevel());
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
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted() && getTortilla().isToasted()
        && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted() && !getTortilla().isToasted()
        && getTortilla2().isToasted()) {
            return "Good quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if (!getQueso().isMelted() && !getTortilla().isToasted()
        && getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (getQueso().isMelted() && !getTortilla().isToasted()
        && !getTortilla2().isToasted()) {
            return "Untoasted quesadilla";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (!getQueso().isMelted() && getTortilla().isToasted()
         && getTortilla2().isToasted()) {
            return "Worst quesadilla";
        } else {
            return "You ran out of gas";
        }
    }
    /**.
     * Return queso object
     * @return Queso
     */
    Queso getQueso() {
        return this.queso;
    }
    /**.
     * Set Queso object
     * @param cheese
     */
    void setQueso(final Queso cheese) {
        this.queso = cheese;
    }
    /**.
     * Return tortilla object
     * @return Tortilla
     */
    Tortilla getTortilla() {
        return this.tortilla;
    }
    /**.
     * Set tortilla object
     * @param newtortilla
     */
    void setTortilla(final Tortilla newtortilla) {
        this.tortilla = newtortilla;
    }
    /**.
     * Get second tortilla
     * @return Tortilla
     */
    Tortilla getTortilla2() {
        return this.tortilla2;
    }
    /**.
     * Set second tortilla
     * @param newtortilla2
     */
    void setTortilla2(final Tortilla newtortilla2) {
        this.tortilla2 = newtortilla2;
    }
    /**.
     * Get heatLevel
     * @return int
     */
    int getHeatLevel() {
        return this.heatLevel;
    }
    /**.
     * Set heatlevel
     * @param newheatLevel
     */
    void setHeatLevel(final int newheatLevel) {
        this.heatLevel = newheatLevel;
    }
}
