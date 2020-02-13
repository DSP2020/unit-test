package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    private boolean tosted;
    private int currentTemperature;
    private int toastTemperature = 5;

    public boolean isToasted() {
        return this.tosted;
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
        this.tosted = toasted;
    }
}
