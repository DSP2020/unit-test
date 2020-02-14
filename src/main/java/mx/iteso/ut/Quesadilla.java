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

        int counter = 0;

     while(getQueso().getCurrentTemperature()<getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()<getTortilla().getToastTemperature()){
         
        getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
        getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());

         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
             getTortilla().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
         if (counter==100)
            break;
        
        counter ++;
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

    public String prepareDouble(){
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        return "";
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(final Queso queso) {
        this.queso = queso;
    }

    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(final Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(final int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
