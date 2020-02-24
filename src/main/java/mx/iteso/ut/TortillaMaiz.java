package mx.iteso.ut;

/**
 * To implement tortilla from interface.
 */
public class TortillaMaiz implements Tortilla {

    /**
     *
     * @return boolean for is tosted or not.
     */
    public boolean isToasted() {
        return false;
    }

    /**
     *
     * @return int get toasted temperature.
     */
    public int getToastTemperature() {
        return 0;
    }

    /**
     *
     * @return int to get current temp.
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
