package mx.iteso.ut;

public interface Tortilla {
    /**
     * is toasted.
     * @return boolean
     */
    boolean isToasted();
    /**
     * get temp.
     * @return  int
     */
    int getToastTemperature();
    /**
     * get curr temp.
     * @return int
     */
    int getCurrentTemperature();
    /**
     * set temp.
     * @param temp
     */
    void setCurrentTemperature(int temp);
    /**
     * set toast.
     * @param toasted
     */
    void toast(boolean toasted);

}
