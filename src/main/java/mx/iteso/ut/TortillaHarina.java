package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public class TortillaHarina implements Tortilla {
/**
*/
private int temp;

/**
*/
private final int toastTemp = 20;

/**
*/
private boolean isToast;

/**
* @return boolean
*/
public final boolean isToasted() {
return isToast;
}

/**
* @return int
*/
public final int getToastTemperature() {
return toastTemp;
}

/**
* @return int
*/
public final int getCurrentTemperature() {
return temp;
}

/**
* @param t
* temperature
*/
public final void setCurrentTemperature(final int t) {
this.temp = t;
}

/**
* @param t
* toast
*/
public final void toast(final boolean t) {
this.isToast = t;
}
}
