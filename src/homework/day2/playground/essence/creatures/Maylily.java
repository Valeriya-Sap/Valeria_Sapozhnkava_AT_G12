package homework.day2.playground.essence.creatures;

import java.io.Serializable;

public class Maylily extends Flower implements Serializable {
    public Maylily(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String toString() {
        return "EssenceObject{name='" + name + "', mass=" + mass + "}";
    }
}
