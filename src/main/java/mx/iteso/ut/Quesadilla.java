/**
 * mx.iteso.ut Paquete de la práctica de unit testing.
 */
package mx.iteso.ut;

/**
 * Clase para describir las acciones de una quesadilla.
 */
public class Quesadilla {
    /**
     * El queso de la quesadilla.
     */
    private Queso queso;

    /**
     * Tortilla para la quesadilla simple.
     */
    private Tortilla tortilla1;

    /**
     * Tortilla para la quesadilla doble.
     */
    private Tortilla tortilla2;

    /**
     * Nivel de calor de la quesadilla.
     */
    private int heatLevel;

    /**
     * Método para preparar una quesadilla doble.
     * @return Mensaje de resultado, Perfect quesadilla, Good quesadilla,
     * Terrible quesadilla, You ran out of gas.
     */
    public String prepareSingle() {

        while (
            getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
            && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()) {

            getTortilla1().setCurrentTemperature(
                getTortilla1().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
            );

            if (getTortilla1().getCurrentTemperature()
                >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted()
            && getTortilla1().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
            && !getTortilla1().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
            && getTortilla1().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }

    /**
     * Método para preparar una quesadilla doble, AKA, sincronizada.
     * @return Mensaje de resultado, Perfect quesadilla, Good quesadilla,
     * Terrible quesadilla, You ran out of gas.
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
                < getQueso().getMeltingTemperature()
            && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()
            && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            if (getTortilla2().getCurrentTemperature()
                >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getTortilla1().getCurrentTemperature()
                >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted()
            && getTortilla1().isToasted()
            && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
            && (!getTortilla1().isToasted()
                || !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
            && (getTortilla1().isToasted()
                || getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     * Obtiene el queso.
     * @return El queso actual.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Establece el queso.
     * @param lqueso queso a establecer.
     */
    public void setQueso(final Queso lqueso) {
        this.queso = lqueso;
    }

    /**
     * Obtiene la tortilla 1.
     * @return La tortilla 1 actual.
     */
    public Tortilla getTortilla1() {
        return this.tortilla1;
    }

    /**
     * Establece la tortilla 1.
     * @param tortilla tortilla a establecer.
     */
    public void setTortilla1(final Tortilla tortilla) {
        this.tortilla1 = tortilla;
    }

    /**
     * Obtiene la tortilla 2.
     * @return La tortilla 2 actual.
     */
    public Tortilla getTortilla2() {
        return this.tortilla2;
    }

    /**
     * Establece la tortilla 2.
     * @param tortilla La tortilla 2 a establecer.
     */
    public void setTortilla2(final Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    /**
     * Obtiene el nivel de calor de la quesadilla..
     * @return El nivel de calor.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Establece el nivel de calor de la tortilla.
     * @param lheatLevel nivel de calor de la tortilla.
     */
    public void setHeatLevel(final int lheatLevel) {
        this.heatLevel = lheatLevel;
    }
}
