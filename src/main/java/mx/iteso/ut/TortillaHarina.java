package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
	private int temp;
	private int toastTemp = 20;
	private boolean isToast;
	
    public boolean isToasted() {
        return isToast;
    }

    public int getToastTemperature() {
        return toastTemp;
    }

    public int getCurrentTemperature() {
        return temp;
    }

    public void setCurrentTemperature(int temp) {
    	this.temp = temp;
    }

    public void toast(boolean toasted) {
    	this.isToast = toasted;
    }
}
