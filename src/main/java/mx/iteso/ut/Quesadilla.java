package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla tortilla2;
    private int heatLevel;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && 
    		 getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
         
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
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        if(getTortilla().isToasted() && getTortilla2().isToasted() && getQueso().isMelted()) return "Buenisima";
        
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        if(!getTortilla().isToasted() && getTortilla2().isToasted() && getQueso().isMelted()) return "Buena";
        
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        if(!getTortilla().isToasted() && getTortilla2().isToasted() && !getQueso().isMelted()) return "Pasable";
        
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        if(!getTortilla().isToasted() && !getTortilla2().isToasted() && !getQueso().isMelted()) return "Regular";
        
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        if(!getTortilla().isToasted() && !getTortilla2().isToasted() && getQueso().isMelted()) return "Mala";
        
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        if(getTortilla().isToasted() && getTortilla2().isToasted() && !getQueso().isMelted()) return "Malisima";
        
        return "no hay gas";
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
    
    public Tortilla getTortilla2() {
        return tortilla2;
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
