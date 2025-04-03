package bubbles;

import java.sql.Array;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].burstBubble();
        }
        Bubble[] emptybubbles = new Bubble[0];
        this.bubbles = emptybubbles;

    }
}
