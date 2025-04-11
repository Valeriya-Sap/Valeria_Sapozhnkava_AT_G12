package homework.day2.playground.essence.creatures;

import homework.day2.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }
    @Override
    public void fly(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", this.getClass(), this.name, direction));
    }
}
