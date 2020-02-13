package mx.iteso.ut;

public class QuesoManchego implements Queso {
    private boolean melted;
    private int temperature;
    private int melting = 20;

    public boolean isMelted() {
        return this.melted;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public int getMeltingTemperature() {
        return this.melting;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }

    public void setMeltingTemperature(int temp){
        this.melting = temp;
    }
}
