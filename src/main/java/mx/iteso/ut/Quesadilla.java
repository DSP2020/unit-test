package mx.iteso.ut;
/**
* ola.
*/
public class Quesadilla {
    /**
     * @param Queso
     */
    private Queso queso;
    /**
     * @param tortilla
     */
    private Tortilla tortilla;
    /**
     * @param heatLevel
     */
    private int heatLevel;

    /**
     * @return String
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature() < getQueso()
        .getMeltingTemperature()
                && getTortilla().getCurrentTemperature() < getTortilla()
                .getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla()
            .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
            .getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla()
            .getToastTemperature()) {
                    getTortilla().toast(true);
                }
            if (getQueso().getCurrentTemperature() >= getQueso()
            .getMeltingTemperature()) {
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
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }
    /**
     * @return Queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * returns queso.
     * @param newQueso **comment**
     */
    public void setQueso(final Queso newQueso) {
        this.queso = newQueso;
    }
    /**
     * @return Tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }
    /**
     * @param newTortilla **comment**
     */
    public void setTortilla(final Tortilla newTortilla) {
        this.tortilla = newTortilla;
    }
    /**
     * @return int
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Set newHeatLevel.
     * @param newHeatLevel **comment**
     */
    public void setHeatLevel(final int newHeatLevel) {
        this.heatLevel = newHeatLevel;
    }
}
