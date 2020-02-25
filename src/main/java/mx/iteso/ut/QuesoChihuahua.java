package mx.iteso.ut;

public class QuesoChihuahua implements Queso {

    private boolean melted;
    private int temperature;
    private int melting = 20;

    public final boolean isMelted() {
        return this.melted;
    }

    public final int getCurrentTemperature() {
        return this.temperature;
    }

    public final int getMeltingTemperature() {
        return this.melting;
    }

    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    public final void melt(final boolean melted) {
        this.melted = melted;

    }
}
