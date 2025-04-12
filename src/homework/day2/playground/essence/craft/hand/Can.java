package homework.day2.playground.essence.craft.hand;

import homework.day2.playground.essence.craft.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {
        super(name, mass);
    }

    public void store(Pourable pourable, int amount) {
        pourable.spread(storeName);
        System.out.printf("I am '%s', my name is '%s' and I received '%d' of '%s'", this.getClass(), this.name, amount, pourable.getClass());
        if (amount > this.mass) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
