package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    private Queso queso;
    private Tortilla tortilla1;
    private Tortilla tortilla2;
    private int heatLevel;

    public String prepareSingle() {

        while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
                && getTortilla1().getCurrentTemperature() < getTortilla1().getToastTemperature()) {
            getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
                getTortilla1().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }

        if (getQueso().isMelted() && getTortilla1().isToasted())
            return "Perfect quesadilla";
        if (getQueso().isMelted() && !getTortilla1().isToasted())
            return "Good quesadilla";
        if (!getQueso().isMelted() && getTortilla1().isToasted())
            return "Terrible quesadilla";
        else
            return "You ran out of gas";

    }

    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        while (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
                && getTortilla1().getCurrentTemperature() < getTortilla1().getToastTemperature() 
                && getTortilla2().getCurrentTemperature() < getTortilla2().getToastTemperature()) {

            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature())
                getTortilla2().toast(true);        
            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
                getTortilla1().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }
        
        if (getQueso().isMelted() && getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Perfect quesadilla";
        if (getQueso().isMelted() && (!getTortilla1().isToasted() || !getTortilla2().isToasted()))
            return "Good quesadilla";
        if (!getQueso().isMelted() && (getTortilla1().isToasted() || getTortilla2().isToasted()))
            return "Terrible quesadilla";
        else
            return "You ran out of gas";
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }

    public Tortilla getTortilla1() {
        return this.tortilla1;
    }

    public void setTortilla1(Tortilla tortilla) {
        this.tortilla1 = tortilla;
    }

    public Tortilla getTortilla2() {
        return this.tortilla2;
    }

    public void setTortilla2(Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
