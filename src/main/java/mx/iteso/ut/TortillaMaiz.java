package mx.iteso.ut;

/**
 * Clase Tortilla de Maiz.
 */
public class TortillaMaiz implements Tortilla {

        /** @return booleano que define si esta tostada o no la tortilla. */
        public boolean isToasted() {
            return false;
        }

        /** @return entero que define temperatura a la que se tuesta. */
        public int getToastTemperature() {
            return 0;
        }

        /** @return entero que muestra la temperatura actual de la tortilla. */
        public int getCurrentTemperature() {
            return 0;
        }

        /** @param temp settea la temperatura actual de la tortilla. */
        public void setCurrentTemperature(final int temp) {

        }

        /** @param toasted pasa el parametro de si esta o no tostada. */
        public void toast(final boolean toasted) {

        }
    }
