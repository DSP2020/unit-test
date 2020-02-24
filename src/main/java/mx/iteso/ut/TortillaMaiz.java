package mx.iteso.ut;

/**
 * Clase que define a TortillaMaiz.
 */
public class TortillaMaiz implements Tortilla {

    /**
     * Guarda true o false dependiendo de si la tortilla esta tostada o no.
     */
    private boolean toasted;

    /**
     * Guarda la tempertaura de la tortilla.
     */
    private int temperature;

    /**
     * Guarda la temperatura a la que se tuesta la tortilla.
     */
    private final int toasting = 20;

    /**
     *
     * @return Indica si la tortilla esta tostada o no.
     */
    public boolean isToasted() {
        return toasted;
    }

    /**
     *
     * @return Devuelve la termperatura a la que se tuesta la tortilla.
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     *
     * @return Devuelve la temperatura de la tortilla.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @param temp Inicializa la temperatura.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param receivedToasted Indica si la tortilla esta tostada
     */
    public void toast(final boolean receivedToasted) {
        this.toasted = receivedToasted;
    }
}
