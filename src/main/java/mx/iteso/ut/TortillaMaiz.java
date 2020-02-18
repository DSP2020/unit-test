package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {

	boolean toasted;
	int temperature;
	int toast = 20;
	
    public boolean isToasted() {
        return this.toasted;
    }

    public int getToastTemperature() {
        return this.temperature;
    }

    public int getCurrentTemperature() {
        return this.toast;
    }

    public void setCurrentTemperature(int temp) {
		this.toast = temp;
    }

    public void toast(boolean toasted) {
		this.toasted = toasted;
    }
}
