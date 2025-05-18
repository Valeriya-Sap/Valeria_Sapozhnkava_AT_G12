package homework.day2.playground.essence.creatures;

import java.io.Serializable;

public abstract class Flower extends Plant implements Serializable {
    public Flower(int mass, String name) {
        super(name, mass);
    }

}
