package mx.iteso.ut;

public class QuesoManchego implements Queso {
	private int temp;
	private int tempToMelt = 90;
	private boolean melted;
	
    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return temp;
    }

    public int getMeltingTemperature() {
        return tempToMelt;
    }

    public void setCurrentTemperature(int temp) {
    	this.temp = temp;
    }

    public void melt(boolean melted) {
    	this.melted = melted;
    }
}
