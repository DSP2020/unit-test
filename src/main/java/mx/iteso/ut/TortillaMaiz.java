package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public class TortillaMaiz implements Tortilla {
/**
*/
private int temp;

/**
*/
private final int toastTemp = 35;

/**
*/
private boolean isToast;

/**
* @return boolean
*/
public boolean isToasted() {
return isToast;
}

/**
* @return int
*/
public int getToastTemperature() {
return toastTemp;
}

/**
* @return int
*/
public int getCurrentTemperature() {
return temp;
}

/**
* @param tmp
* temperature
*/
public void setCurrentTemperature(final int tmp) {
this.temp = tmp;
}

/**
*@param toasted
*toasted
*/
public void toast(final boolean toasted) {
this.isToast = toasted;
}
}
