package mx.iteso.ut;

/**
 * method.
 */
public class TortillaHarina implements Tortilla {
    /**
     * toasted boolean.
     */
    private boolean toasted;
    /**
     * tTemperature int.
     */
    private int tTemperature; //=10
    /**
     * cTemperature int.
     */
    private int cTemperature;

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
