package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private int heatLevel;

    public String prepareSingle(){
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                getTortilla().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }

        if(getQueso().isMelted() && getTortilla().isToasted())
            return "Perfect quesadilla";
        if(getQueso().isMelted() && !getTortilla().isToasted())
            return "Good quesadilla";
        if(!getQueso().isMelted() && getTortilla().isToasted())
            return "Terrible quesadilla";
        else
            return "You ran out of gas";

    }

    public String prepareDouble(Tortilla secondTortilla){
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() 
                    && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()
                    && secondTortilla.getCurrentTemperature() < secondTortilla.getToastTemperature()){

            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            secondTortilla.setCurrentTemperature(secondTortilla.getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());

            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                getTortilla().toast(true);
            if(secondTortilla.getCurrentTemperature() >= secondTortilla.getToastTemperature())
                secondTortilla.toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }
        String message = "";

        if(getTortilla().isToasted() && secondTortilla.isToasted() && getQueso().isMelted())
            message = "Perfect quesadilla";   
        if(getTortilla().isToasted() && secondTortilla.isToasted() && !getQueso().isMelted())
            message = "Bad quesadilla";
        if(getTortilla().isToasted() && !secondTortilla.isToasted() && getQueso().isMelted())
            message = "Good quesadilla";   
        if(getTortilla().isToasted() && !secondTortilla.isToasted() && !getQueso().isMelted())
            message = "Bad quesadilla";   
        if(!getTortilla().isToasted() && secondTortilla.isToasted() && getQueso().isMelted())
            message = "Good quesadilla";   
        if(!getTortilla().isToasted() && secondTortilla.isToasted() && !getQueso().isMelted())
            message = "Bad quesadilla";   
        if(!getTortilla().isToasted() && !secondTortilla.isToasted() && getQueso().isMelted())
            message = "Bad quesadilla";   
        if(!getTortilla().isToasted() && !secondTortilla.isToasted() && !getQueso().isMelted())
            message = "You ran out of gas";
        return message;
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }


    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
