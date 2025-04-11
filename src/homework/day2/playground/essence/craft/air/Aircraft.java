package homework.day2.playground.essence.craft.air;

import homework.day2.playground.essence.Flyable;
import homework.day2.playground.essence.Matter;
import homework.day2.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(String name, int mass) {
        super(mass);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
