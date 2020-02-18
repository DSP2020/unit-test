package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla1;
    private Tortilla tortilla2;
    private int heatLevel;

    public String prepareSingle(){

     int counter = 0;

     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && 
     getTortilla1().getCurrentTemperature()< getTortilla1().getToastTemperature()){

         getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());

         if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
             getTortilla1().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);

         counter = counter + 1;
  
         if(counter > 10)
            break;

     }

     if(getQueso().isMelted() && getTortilla1().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla1().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla1().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";

    }

    public String prepareDouble(){

        int counter = 0;

        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && 
        getTortilla1().getCurrentTemperature()< getTortilla1().getToastTemperature() &&
        getTortilla2().getCurrentTemperature()< getTortilla2().getToastTemperature()){

            
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());

            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
                getTortilla1().toast(true);

            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature())
                getTortilla2().toast(true);

            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);

            counter = counter + 1;
  
            if(counter > 10)
               break;

            
        }
       
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted() && getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Perfect quesadilla";
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if (getQueso().isMelted() && !getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Almost perfect quesadilla";
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if (!getQueso().isMelted() && getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Bad quesadilla, Cheese not melted";
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if (getQueso().isMelted() && !getTortilla1().isToasted() && !getTortilla2().isToasted())
            return "Bad quesadilla, Burned Tortilla";
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if(!getQueso().isMelted() && !getTortilla1().isToasted() && getTortilla2().isToasted())
            return "Terrible quesadilla";
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if(!getQueso().isMelted() && !getTortilla1().isToasted() && !getTortilla2().isToasted())
            return "Very Terrible quesadilla";
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
        return tortilla1;
    }

    public Tortilla getTortilla2() {
        return tortilla2;
    }

    public void setTortilla1(Tortilla tortilla) {
        this.tortilla1 = tortilla;
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
