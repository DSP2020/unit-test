package mx.iteso.ut;
/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong.
 * @version: 21/02/2020
*/
public class Quesadilla {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Queso queso;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Tortilla tortilla;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private Tortilla tortillaExtra;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private int heatLevel;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public String prepareSingle() {

    while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
           && getTortilla().getCurrentTemperature()
            < getTortilla().getToastTemperature()) {
        getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel()
        );
        getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
        );
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
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
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
                && getTortillaExtra().getCurrentTemperature()
                < getTortillaExtra().getToastTemperature()) {

            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel()
            );
            getTortillaExtra().setCurrentTemperature(
                getTortillaExtra().getCurrentTemperature() + getHeatLevel()
            );
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
            );

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
        if (getQueso().isMelted()
            && getTortilla().isToasted() && getTortillaExtra().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
            && (!getTortilla().isToasted()
                || !getTortillaExtra().isToasted())) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
            && (getTortilla().isToasted() || getTortillaExtra().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Queso getQueso() {
        return queso;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param quesoParam El parámetro numeroItems define el número de element
    *os que va a tener la serie aleatoria
    */
    public void setQueso(final Queso quesoParam) {
        this.queso = quesoParam;
    }

    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Tortilla getTortilla() {
        return tortilla;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Tortilla getTortillaExtra() {
        return tortillaExtra;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param tortillaParam El parámetro numeroItems define el número de element
    *os que va a tener la serie aleatoria
    */
    public void setTortilla(final Tortilla tortillaParam) {
        this.tortilla = tortillaParam;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param tortillaParam El parámetro numeroItems define el número de element
    *os que va a tener la serie aleatoria
    */
    public void setTortillaExtra(final Tortilla tortillaParam) {
        this.tortillaExtra = tortillaParam;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public int getHeatLevel() {
        return heatLevel;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    *@param heatLevelParam El parámetro numeroItems define el número de element
    *os que va a tener la serie aleatoria
    */
    public void setHeatLevel(final int heatLevelParam) {
        this.heatLevel = heatLevelParam;
    }
}
