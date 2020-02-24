package mx.iteso.ut;

public class QuesoChihuahua implements Queso {

    /**
     *
     */
    static final int MELTING_TEMP = 20;
    /**
     *
     */
    private boolean melted;
    /**
     *
     */
    private int temperature;
    /**
     *
     */
    private int melting = MELTING_TEMP;

    /**
     * @return boolean
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * @return int
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @return int
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * @param temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param newMeltedValue
     */
    public void melt(final boolean newMeltedValue) {
        this.melted = newMeltedValue;

    }
}
