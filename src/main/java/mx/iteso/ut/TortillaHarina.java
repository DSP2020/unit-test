package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    boolean toast;
    int toastTemperature = 25;
    int currentTemperature;

    public boolean isToasted() {
        return this.toast;
    }

    public int getToastTemperature() {
        return this.toastTemperature;
    }

    public int getCurrentTemperature() {
        return this.currentTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.currentTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.toast = toasted;
    }
}
