package mx.iteso.ut;

public class Quesadilla {
	/**
	 * Tipo de queso.
	 */
    private Queso queso;
    /**Tipo de tortilla.*/
    private Tortilla tortilla;
    /**Nivel calentar.*/
    private int heatLevel;
    /**Tipo tortilla 2.*/
    private Tortilla tortilla2;
    /** Método para preparar quesadilla simple.
     * @return String resultante de la quesadilla.
     **/
    public String prepareSingle() {
    while (getQueso().getCurrentTemperature()
    		 < getQueso().getMeltingTemperature()
    		 && getTortilla().getCurrentTemperature()
    		 < getTortilla().getToastTemperature()) {
         getTortilla().
         setCurrentTemperature(getTortilla().getCurrentTemperature()
        		+ getHeatLevel());
         getQueso().
         setCurrentTemperature(getQueso().getCurrentTemperature()
        		 + getHeatLevel());
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
     * Método para la quesadilla doble.
     * @return String con el resultado de quesadilla.
     */
    public String prepareDouble() {
    	 while (getQueso().getCurrentTemperature()
    			 < getQueso().getMeltingTemperature()
    			 && getTortilla().getCurrentTemperature()
    			 < getTortilla().getToastTemperature()
    			 && getTortilla2().getCurrentTemperature()
    			 < getTortilla2().getToastTemperature()) {
             getTortilla()
             .setCurrentTemperature(getTortilla().getCurrentTemperature()
            		 + getHeatLevel());
             getTortilla2()
             .setCurrentTemperature(getTortilla2().getCurrentTemperature()
            		 + getHeatLevel());
             getQueso()
             .setCurrentTemperature(getQueso().getCurrentTemperature()
            		 + getHeatLevel());
             if (getTortilla().getCurrentTemperature()
            		 >= getTortilla().getToastTemperature()) {
            	 getTortilla().toast(true);
             }
             if (getTortilla2().getCurrentTemperature()
            		 >= getTortilla2().getToastTemperature()) {
            	 getTortilla2().toast(true);
             }
             if (getQueso().getCurrentTemperature()
            		 >= getQueso().getMeltingTemperature()) {
            	 getQueso().melt(true);
             }
         }
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
    	 if (getQueso().isMelted() && getTortilla()
    			 .isToasted() && getTortilla2().isToasted()) {
    		 return "Perfect quesadilla";
    	 }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
    	 if (getQueso().isMelted() && !getTortilla()
    			 .isToasted() && getTortilla2().isToasted()) {
    		 return "Good quesadilla";
    	 }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
    	 if (!getQueso().isMelted() && !getTortilla()
    			 .isToasted() && getTortilla2().isToasted()) {
    		 return "Bad quesadilla";
    	 }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
    	 if (getQueso().isMelted() && !getTortilla()
    			 .isToasted() && !getTortilla2().isToasted()) {
    		 return "Awful quesadilla";
    	 }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
    	 if (!getQueso().isMelted() && getTortilla()
    			 .isToasted() && getTortilla2().isToasted()) {
    		 return "Terrible quesadilla";
    	 // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
    	 } else {
    		 return "You ran out of gas";
    	 }
    }
    /**
     * Método para obtener queso.
     * @return Regresa queso de tipo queso.
     */
    public Queso getQueso() {
        return queso;
    }
    /**
     * Método que modifica el queso.
     * @param que tipo de queso.
     */
    public void setQueso(final Queso que) {
        this.queso = que;
    }
    /**
     * Metodo.
     * @return tortilla2 objeto tortilla.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }
    /**
     * Método.
     * @param t2 es un objeto.
     */
    public final void setTortilla2(final Tortilla t2) {
        this.tortilla2 = t2;
    }
    /**
     * Método para obtener tortilla 1.
     * @return tortilla jeje.
     */
    public Tortilla getTortilla() {
        return tortilla;
    }
    /**
     * Método que modifica la tortilla.
     * @param t1 ja.
     */
    public void setTortilla(final Tortilla t1) {
        this.tortilla = t1;
    }
    /**
     * Método que obtiene el heatLvl.
     * @return heatLevel oh.
     */
    public int getHeatLevel() {
        return heatLevel;
    }
    /**
     * Método para modificar el heatLvl.
     * @param heatLev
     */
    public void setHeatLevel(final int heatLev) {
        this.heatLevel = heatLev;
    }
}
