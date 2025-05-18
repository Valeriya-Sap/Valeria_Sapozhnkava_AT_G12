package homework.day2.playground.essence.creatures;

import homework.day2.playground.essence.Matter;

import java.io.Serializable;

public abstract class Plant extends Matter implements Serializable {
    protected String name;

    public Plant(String name, int mass) {
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
