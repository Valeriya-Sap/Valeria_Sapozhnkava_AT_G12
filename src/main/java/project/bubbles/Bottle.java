package project.bubbles;

public class Bottle {
    private double volume;
    private SparklingWater sparkling = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] numberOfBubbles = new Bubble[(int) (volume * 10)];
        for (int i = 0; i < numberOfBubbles.length; i++) {
            numberOfBubbles[i] = new Bubble();
        }
        sparkling.pump(numberOfBubbles);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void open() {
        sparkling.degas();
    }
}
