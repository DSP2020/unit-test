package mx.iteso.ut;
/**
* Comment del llabadok.
*/
public interface Queso {
    /**
    * @return boolean
    */
    boolean isMelted();
    /**
    * @return int
    */
    int getCurrentTemperature();
    /**
    * @return int
    */
    int getMeltingTemperature();
    /**
    * @param newTemp **void**
    */
    void setCurrentTemperature(int newTemp);
    /**
    * @param newMelted **void**
    */
    void melt(boolean newMelted);
}
