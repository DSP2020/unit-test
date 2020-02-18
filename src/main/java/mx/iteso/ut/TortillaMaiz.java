package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
	boolean tost;
    int temperature;
    int tosted = 20;
	
    public boolean isToasted() {
        return this.tost;
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
    	this.tost = toasted;
    }
}
