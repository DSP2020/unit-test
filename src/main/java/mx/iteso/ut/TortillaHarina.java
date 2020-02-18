package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
	boolean toast;
    int temperature;
    int tosted = 20;
    		
    public boolean isToasted() {
        return this.toast;
    }

    public int getToastTemperature() {
        return this.tosted;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public void setCurrentTemperature(int temp) {
    	this.temperature = temp;
    }

    public void toast(boolean toasted) {
    	this.toast = toasted;
    }
}
