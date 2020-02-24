package mx.iteso.ut;

/**
 * Clase representante de una quesadilla.
 *
 */
public class Quesadilla {
    /**
     * El queso de la quesadilla.
     */
    private Queso queso;
    /**
     * La tortilla de la quesadilla.
     */
    private Tortilla tortilla;
    /**
     * La temperatura de la quesadilla.
     */
    private int heatLevel;

    /**
     * Prepara una quesadilla con una sola tortilla.
     * @return void
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {

            getTortilla()
                .setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());

            getQueso()
                .setCurrentTemperature(getQueso()
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
        } else if (getQueso().isMelted() && !getTortilla().isToasted()) {
            return "Good quesadilla";
        } else if (!getQueso().isMelted() && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }

    /**
     * Prepara una quesadilla con dos tortillas.
     * @param secondTortilla segunda tortilla de la quesadilla doble
     * @return void
     */
    public String prepareDouble(final Tortilla secondTortilla) {
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
                && secondTortilla.getCurrentTemperature()
                < secondTortilla.getToastTemperature()) {

            getTortilla()
                .setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());

            secondTortilla
                .setCurrentTemperature(secondTortilla
                    .getCurrentTemperature() + getHeatLevel());

            getQueso()
                .setCurrentTemperature(getQueso()
                    .getCurrentTemperature() + getHeatLevel());

            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                        getTortilla().toast(true);
            }

            if (secondTortilla.getCurrentTemperature()
                    >= secondTortilla.getToastTemperature()) {
                        secondTortilla.toast(true);
            }

            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                        getQueso().melt(true);
            }
        }

        String message = "";

        if (getTortilla().isToasted()
                && secondTortilla.isToasted()
                && getQueso().isMelted()) {
                    message = "Perfect quesadilla";
        }

        if (getTortilla().isToasted()
                && secondTortilla.isToasted()
                && !getQueso().isMelted()) {
                    message = "Bad quesadilla";
        }

        if (getTortilla().isToasted()
                && !secondTortilla.isToasted()
                && getQueso().isMelted()) {
                    message = "Good quesadilla";
        }

        if (getTortilla().isToasted()
                && !secondTortilla.isToasted()
                && !getQueso().isMelted()) {
                    message = "Bad quesadilla";
        }

        if (!getTortilla().isToasted()
                && secondTortilla.isToasted()
                && getQueso().isMelted()) {
                    message = "Good quesadilla";
        }

        if (!getTortilla().isToasted()
                && secondTortilla.isToasted()
                && !getQueso().isMelted()) {
                    message = "Bad quesadilla";
        }

        if (!getTortilla().isToasted()
                && !secondTortilla.isToasted()
                && getQueso().isMelted()) {
                    message = "Bad quesadilla";
        }

        if (!getTortilla().isToasted()
                && !secondTortilla.isToasted()
                && !getQueso().isMelted()) {
                    message = "You ran out of gas";
        }

        return message;
    }

    /**
     * Obtener el queso de la quesadilla.
     * @return Queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Setea el queso de la quesadilla.
     * @param newQueso queso nuevo
     */
    public void setQueso(final Queso newQueso) {
        this.queso = newQueso;
    }

    /**
     * Obtener la tortilla de la quesadilla.
     * @return Tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Setea la tortilla de la quesadilla.
     * @param newTortilla tortilla nueva
     */
    public void setTortilla(final Tortilla newTortilla) {
        this.tortilla = newTortilla;
    }

    /**
     * Obtener el calor de la quesadilla.
     * @return heat
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Setea el calor de la quesadilla.
     * @param newHeatLevel calor nuevo
     */
    public void setHeatLevel(final int newHeatLevel) {
        this.heatLevel = newHeatLevel;
    }
}
