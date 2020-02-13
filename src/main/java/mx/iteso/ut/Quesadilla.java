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
    private Tortilla tortilla2;

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

    public String prepareDouble(){
    	
    	
    	 while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature() 
    			 && getTortilla2().getCurrentTemperature()< getTortilla2().getToastTemperature()){
             getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
             getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());
             getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
             if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                 getTortilla().toast(true);
             if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature())
                 getTortilla2().toast(true);
             if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                 getQueso().melt(true);
         }
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
    	 if(getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted() )
             return "Perfect quesadilla";
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
    	 if(getQueso().isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted())
             return "Good quesadilla";
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
    	 if(!getQueso().isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted())
             return "Bad quesadilla";
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
    	 if(getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla2().isToasted())
             return "Awful quesadilla";
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
    	 if(!getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted())
             return "Terrible quesadilla";
    	 // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
    	 else 
             return "You ran out of gas";
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }
    
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    public void setTortilla2(Tortilla tortilla) {
        this.tortilla2 = tortilla;
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
