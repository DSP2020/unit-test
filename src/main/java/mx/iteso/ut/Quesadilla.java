package mx.iteso.ut;

/**
 * Hello world!
 */
public class Quesadilla {
    /**
     * @queso is the queso
     */
    private Queso queso;
    /**
     * @tortilla is the tortilla
     */
    private Tortilla tortilla;
    /**
     * @tortillaExtra is the second tortilla
     */
    private Tortilla tortillaExtra;
    /**
     * @heatLevel is the heat level
     */
    private int heatLevel;

    /**
     * Prepare single string.
     *
     * @return the string
     */
    public String prepareSingle() {

        while (
                getQueso().getCurrentTemperature()
                        <
                getQueso().getMeltingTemperature()
                        &&
                getTortilla().getCurrentTemperature()
                        <
                        getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                    getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                    + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                    >=
                    getTortilla().getToastTemperature()) {
                    getTortilla().toast(true);
                }
            if (getQueso().getCurrentTemperature()
                    >=
                    getQueso().getMeltingTemperature()) {
                    getQueso().melt(true);
                }
        }

        if (
                getQueso().isMelted() && getTortilla().isToasted()) {
                return "Perfect quesadilla";
        }
        if (
                getQueso().isMelted() && !getTortilla().isToasted()) {
                return "Good quesadilla";
        }
        if (
                !getQueso().isMelted() && getTortilla().isToasted()) {
                return "Terrible quesadilla";
        } else {
                return "You ran out of gas";
            }

    }

    /**
     * Prepare double string.
     *
     * @return the string
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
                        <
                getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                        <
                getTortilla().getToastTemperature()
                && getTortillaExtra().getCurrentTemperature()
                        <
                getTortillaExtra().getToastTemperature()) {

            getTortilla().setCurrentTemperature(
                    getTortilla().getCurrentTemperature()
                            +
                            getHeatLevel());
            getTortillaExtra().setCurrentTemperature(
                    getTortillaExtra().getCurrentTemperature()
                            +
                            getHeatLevel());
            getQueso().setCurrentTemperature(
                    getQueso().getCurrentTemperature()
                            +
                            getHeatLevel());

            if (getTortilla().getCurrentTemperature()
                    >=
                    getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getTortillaExtra().getCurrentTemperature()
                    >=
                    getTortillaExtra().getToastTemperature()) {
                getTortillaExtra().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >=
                    getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted() && getTortilla().isToasted()
                &&
                getTortillaExtra().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && (!getTortilla().isToasted()
                ||
                !getTortillaExtra().isToasted())) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && (getTortilla().isToasted()
                ||
                getTortillaExtra().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }


    /**
     * Gets queso.
     *
     * @return the queso
     */
    public Queso getQueso() {
        return queso;
    }


    /**
     * Sets queso.
     *
     * @param q the queso
     */
    public void setQueso(final Queso q) {
        this.queso = q;
    }


    /**
     * Gets tortilla.
     *
     * @return the tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Gets tortilla extra.
     *
     * @return the tortilla extra
     */
    public Tortilla getTortillaExtra() {
        return tortillaExtra;
    }

    /**
     * Sets tortilla.
     *
     * @param t the tortilla
     */
    public void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
     * Sets tortilla extra.
     *
     * @param t the tortilla
     */
    public void setTortillaExtra(final Tortilla t) {
        this.tortillaExtra = t;
    }

    /**
     * Gets heat level.
     *
     * @return the heat level
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Sets heat level.
     *
     * @param hl the heat level
     */
    public void setHeatLevel(final int hl) {
        this.heatLevel = hl;
    }
}
