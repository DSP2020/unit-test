package mx.iteso.ut;
/**
* la clase.
*/
public class QuesoChihuahua implements Queso {
    /**
     * ola.
     */
    private final int num = 20;
    /**
     * @param melded
     */
    private boolean melted;
    /**
     * @param temperature
     */
    private int temperature;
    /**
     * @param melting
     */
    private int melting = num;
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
     * @param newTemp **comment**
     */
    public void setCurrentTemperature(final int newTemp) {
        this.temperature = newTemp;
    }
    /**
     * @param newMelted **comment**
     */
    public void melt(final boolean newMelted) {
        this.melted = newMelted;

    }
}
