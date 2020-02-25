package mx.iteso.ut;

/** Interface para los quesos. */
public interface Queso {
    /** @return isMelted que define si el queso esta derretido o no. */
    boolean isMelted();
    /** @return temperatura actual del queso. */
    int getCurrentTemperature();
    /** @return temperatura necesaria para que se derrita el queso. */
    int getMeltingTemperature();
    /** @param temp define la temperatura actual. */
    void setCurrentTemperature(int temp);
    /** @param melted define si esta derretido o no.*/
    void melt(boolean melted);
}
