package project.bubbles;

public class Bubble {
    private final double volume = 0.3;
    private String gasComposition;

    public Bubble() {
    }

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burstBubble() {
        System.out.println("Cramp!");
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public double getVolume() {
        return volume;
    }
}
