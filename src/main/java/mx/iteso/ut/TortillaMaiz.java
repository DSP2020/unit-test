package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    /**
     * toasted.
     */
    private boolean toasted;
    /**
     * temp.
     */
    private int temperature;
    /**
     * toasting.
     */
    private final int toasting = 20;
    /**
     * is toasted.
     * @return boolean
     */
    public boolean isToasted() {
        return this.toasted;
    }
    /**
     * get toast temp.
     * @return int
     */
    public int getToastTemperature() {
        return this.toasting;
    }
    /**
     * get curr. temp.
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }
    /**
     * set temp.
     * @param temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
     * set toast.
     * @param ttoasted
     */
    public void toast(final boolean ttoasted) {
        this.toasted = ttoasted;
    }
}
