package mx.iteso.ut;

/** Interfase que define a cualquier tipo de tortilla. */
public interface Tortilla {

    /** @return booleano que define si esta tostada. */
    boolean isToasted();
    /** @return Entero que define la temperatura a la que se tuesta. */
    int getToastTemperature();
    /** @return Entero que define la temperatura actual. */
    int getCurrentTemperature();
    /** @param temp temperatura actual. */
    void setCurrentTemperature(int temp);
    /** @param toasted define si esta o no tostada. */
    void toast(boolean toasted);

}
