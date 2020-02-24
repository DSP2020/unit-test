package mx.iteso.ut;

/**
 * Interface para describir el comportamieto de una tortilla.
 */
interface Tortilla {
    /**
     * Regresa si una tortilla está tostada.
     * @return Verdadero si una tortilla está tostada.
     */
     boolean isToasted();
    /**
     * Obtiene la temperatura de tostado.
     * @return Temperatura de tostado.
     */
     int getToastTemperature();
    /**
     * Obtiene la temperatura de tostado de una tortilla.
     * @return Tempertatura de tostado.
     */
     int getCurrentTemperature();
    /**
     * Establece la temperatura de tostado.
     * @param temp la nuva temperatura de tostado.
     */
     void setCurrentTemperature(int temp);
    /**
     * Tosta una tortilla.
     * @param toasted Nuevo estao de tostado.
     */
     void toast(boolean toasted);

}
