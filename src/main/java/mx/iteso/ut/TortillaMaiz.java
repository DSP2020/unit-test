package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    boolean toasted;
    int cTemperature = 15;
    int tTemperature;
    public boolean isToasted() {
        return this.toasted;
    }

    public int getToastTemperature() {
        return this.tTemperature;
    }

    public int getCurrentTemperature() {
        return this.cTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.cTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
