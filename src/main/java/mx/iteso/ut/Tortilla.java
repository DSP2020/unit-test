package mx.iteso.ut;
public interface Tortilla {
    /**
     * Metodo.
     * @return valor toasted
     */
     boolean isToasted();
    /**
     * Metodo.
     * @return valor toasting temp.
     */
     int getToastTemperature();
    /**
     * Metodo.
     * @return current temp.
     */
     int getCurrentTemperature();
    /**
     * Metodo.
     * @param temp para modificar el promedio de temperatura.
     */
     void setCurrentTemperature(int temp);
    /**
     * Metodo.
     * @param toasted que es v o f.
     */
     void toast(boolean toasted);

}
