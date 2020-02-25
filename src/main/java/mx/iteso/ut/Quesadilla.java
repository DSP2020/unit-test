/**
 * mx.iteso.ut Paquete de la práctica de unit testing.
 */
package mx.iteso.ut;

/**
 * Esta clase es Quesadilla.
 * @version: 24/02/2020
 */
public class Quesadilla {

    /**
    * Variable.
    */
    private Queso queso;
    /**
    * Variable.
    */
    private Tortilla tortilla;
    /**
    * Variable.
    */
    private Tortilla tortillaExtra;
    /**
    * Variable.
    */
    private int heatLevel;

    /**
    * Método que devuelve si el queso esta derretido.
    * @return boleano si esta o no derretido
    */
    final String prepareSingle() {

        while (
            getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            && getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()) {
                getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature()
                + getHeatLevel());
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
    * Método que devuelve si el queso esta derretido.
    * @return boleano si esta o no derretido
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
            && getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()
            && getTortillaExtra().getCurrentTemperature()
            < getTortillaExtra().getToastTemperature()) {

            getTortilla().setCurrentTemperature(
            getTortilla().getCurrentTemperature()
            + getHeatLevel());

            getTortillaExtra().setCurrentTemperature(
            getTortillaExtra().getCurrentTemperature()
            + getHeatLevel());

            getQueso().setCurrentTemperature(
            getQueso().getCurrentTemperature()
            + getHeatLevel());

            if (getTortilla().getCurrentTemperature()
            >= getTortilla().getToastTemperature()) {
                 getTortilla().toast(true);
            }
            if (getTortillaExtra().getCurrentTemperature()
            >= getTortillaExtra().getToastTemperature()) {
                getTortillaExtra().toast(true);
            }
            if (getQueso().getCurrentTemperature()
            >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted() && getTortilla().isToasted()
        && getTortillaExtra().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && (!getTortilla().isToasted()
        || !getTortillaExtra().isToasted())) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && (getTortilla().isToasted()
        || getTortillaExtra().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }
    /**
    * Método que devuelve si el queso esta derretido.
    * @return boleano si esta o no derretido
    */
    public Queso getQueso() {
        return queso;
    }
    /**
     * * Método que le da valor a temperatura.
    * @param quesoNew la temperatura que se le da
    */
    public void setQueso(final Queso quesoNew) {
        this.queso = quesoNew;
    }

    /**
    * Método que devuelve el número de la temperatura.
    * @return la temperatura actua
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
    * Método que devuelve el número de la temperatura.
    * @return la temperatura actua
    */
    public Tortilla getTortillaExtra() {
        return tortillaExtra;
    }

    /**
    * Método que le da valor a temperatura.
    * @param tortillaNew la temperatura que se le da
    */
    public void setTortilla(final Tortilla tortillaNew) {
        this.tortilla = tortillaNew;
    }

    /**
    * Método que le da valor a temperatura.
    * @param tortillaEx la temperatura que se le da
    */
    public void setTortillaExtra(final Tortilla tortillaEx) {
        this.tortillaExtra = tortillaEx;
    }

    /**
    * Método que devuelve el número de la temperatura.
    * @return la temperatura actua
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
    * Método que le da valor a temperatura.
    * @param heatLevelNew la temperatura que se le da
    */
    public void setHeatLevel(final int heatLevelNew) {
        this.heatLevel = heatLevelNew;
    }
}
