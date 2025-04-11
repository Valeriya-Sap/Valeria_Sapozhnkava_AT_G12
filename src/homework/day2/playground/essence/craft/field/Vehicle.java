package homework.day2.playground.essence.craft.field;

import homework.day2.playground.essence.Matter;
import homework.day2.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Runnable {
    protected String name;

    public Vehicle(String name, int mass) {
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
