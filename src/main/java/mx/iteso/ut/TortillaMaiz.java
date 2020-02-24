package mx.iteso.ut;

/**
 * class.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * toasted boolean.
     */
    private boolean toasted;
    /**
     * cTemperature int.
     */
    private int cTemperature;
    /**
     * tTemperature int.
     */
    private int tTemperature = 0;

    /**
     *
     * @return toasted var
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     *
     * @return tTemperature var
     */
    public int getToastTemperature() {
        return this.tTemperature;
    }

    /**
     *
     * @return cTemperature var
     */
    public int getCurrentTemperature() {
        return this.cTemperature;
    }

    /**
     *
     * @param temp int
     */
    public void setCurrentTemperature(final int temp) {
        this.cTemperature = temp;
    }

    /**
     *
     * @param varToasted boolean
     */
    public void toast(final boolean varToasted) {
        this.toasted = varToasted;
    }
}
