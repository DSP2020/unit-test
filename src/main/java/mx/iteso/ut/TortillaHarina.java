package mx.iteso.ut;

/**
 * For implementing tortilla interface.
 */
public class TortillaHarina implements Tortilla {

    /**
     *
     * @return boolean for is toasted.
     */
    public boolean isToasted() {
        return false;
    }

    /**
     *
     * @return int to get toast temperature.
     */
    public int getToastTemperature() {
        return 0;
    }

    /**
     *
     * @return int to get current temperature.
     */
    public int getCurrentTemperature() {
        return 0;
    }

    /**
     *
     * @param temp for getting temp.
     */
    public void setCurrentTemperature(final int temp) {

    }

    /**
     *
     * @param toasted for toasting.
     */
    public void toast(final boolean toasted) {

    }
}
