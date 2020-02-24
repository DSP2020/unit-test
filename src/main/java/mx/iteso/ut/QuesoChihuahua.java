package mx.iteso.ut;

/**
 * Implementación del queso chihuahua.
 */
public class QuesoChihuahua implements Queso {
    /**
     * Estado del queso.
     */
    private boolean mMelted;
    /**
     * Temperatura del queso.
     */
    private int mTemperature;
    /**
     * Temperatura de derretimiento de queso.
     */
    private final int mMelting = 20;

    /**
     * Estado del queso.
     * @return Verdadero si el queso está derretido.
     */
    @Override
    public boolean isMelted() {
        return this.mMelted;
    }

    /**
     * Obtiene la temperatura actual del queso.
     * @return La temperatura actual del queso.
     */
    @Override
    public int getCurrentTemperature() {
        return this.mTemperature;
    }

    /**
     * Obtiene la temeratura de derretimiento del queso.
     * @return La temperatura de derretimiento del queso.
     */
    @Override
    public int getMeltingTemperature() {
        return this.mMelting;
    }

    /**
     * Establece la temperatura actual del queso.
     * @param temp La temperatura actual del queso.
     */
    @Override
    public void setCurrentTemperature(final int temp) {
        this.mTemperature = temp;
    }

    /**
     * Derrite el queso.
     * @param melted bandera de queso derretido.
     */
    @Override
    public void melt(final boolean melted) {
        this.mMelted = melted;

    }
}
