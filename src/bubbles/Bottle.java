package bubbles;

public class Bottle {
    private double volume;
    private SparklingWater sparkling = new SparklingWater();

    public Bottle(double volume) {
        this.volume = volume;
    }

    public Bottle() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public void fill() {
        Bubble[] numberOfBubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < numberOfBubbles.length; i++) {
            numberOfBubbles[i] = new Bubble();
        }
        sparkling.pump(numberOfBubbles);
    }

    public void open() {
        sparkling.degas();
    }


}
