package homework.day2.playground.essence.craft.air;

import homework.day2.playground.essence.Flyable;
import homework.day2.playground.essence.Matter;
import homework.day2.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.name, direction));
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d", this.getClass().getSimpleName(), this.name, pointA, pointB));
        return pointB - pointA;
    }
}
