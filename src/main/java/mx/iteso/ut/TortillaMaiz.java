package mx.iteso.ut;

/**
 * Esta clase es queso Tortilla de maiz.
 * @version: 24/02/2020
 */
public class TortillaMaiz implements Tortilla {
    /**
    * Variable.
    */
    private final int mELT = 20;
    /**
    * Variable.
    */
    private boolean toasted;
    /**
    * Variable.
    */
    private int temperature;
    /**
    * Variable.
    */
    private int toasting = mELT;

    /**
    *
    * Método que devuelve si el queso esta tostado.
    * @return boleano si esta o no tostado
    */
    public boolean isToasted() {
        return this.toasted;
    }

     /**
    * Método que devuelve si el queso esta tostado.
    * @return boleano si esta o no tostado
    */
    public int getToastTemperature() {
        return this.toasting;
    }

     /**
    * Método que devuelve si el queso esta tostado.
    * @return boleano si esta o no tostado
    */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
    * Método que le da valor a temperatura.
    * @param temp la temperatura que se le da
    */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
    * Método que le da valor a temperatura.
    * @param toastedNew la temperatura que se le da
    */
    public void toast(final boolean toastedNew) {
        this.toasted = toastedNew;
    }
}
