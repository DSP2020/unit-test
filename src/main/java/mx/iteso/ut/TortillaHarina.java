package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    private boolean toasted;
    private int temperature;
    private int tTemp = 20;
    public final boolean isToasted() {
        return this.toasted;
    }

    public final int getToastTemperature() {
        return this.tTemp;
    }

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    public final void toast(final boolean toasted) {
        this.toasted = toasted;
    }
}
