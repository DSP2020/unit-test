package mx.iteso.ut;
/**
* javadoc.
*/
public interface Tortilla {
    /**
    * @return boolean
    */
    boolean isToasted();
    /**
    * @return int
    */
    int getToastTemperature();
    /**
    * @return int
    */
    int getCurrentTemperature();
    /**
    * @param newTemp **ola**
    */
    void setCurrentTemperature(int newTemp);
    /**
    * @param newToasted **ola**
    */
    void toast(boolean newToasted);

}
