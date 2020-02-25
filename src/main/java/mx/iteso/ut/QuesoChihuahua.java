package mx.iteso.ut;

/** comentario generico Javadoc. */
public class QuesoChihuahua implements Queso {

    /** booleano para definir si esta derretido. */
    private boolean melted;
    /** Entero que define la temperatura del queso. */
    private int temperature;
    /** Entero que define temperatura a la que se derrite el queso. */
    private final int melting = 20;

    /** @return si el queso esta o no derretido. */
    public boolean isMelted() {
        return this.melted;
    }

    /** @return temperatura actual del queso. */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /** @return temperatura a la que se derrite el queso. */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /** @param temp setea la temperatura del queso. */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /** @param melted2 setea melted a su valor. */
    public void melt(final boolean melted2) {
        this.melted = melted2;
    }
}
