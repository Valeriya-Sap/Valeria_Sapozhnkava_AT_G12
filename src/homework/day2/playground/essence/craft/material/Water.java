package homework.day2.playground.essence.craft.material;

public class Water implements Pourable {
    protected int mass;

    public Water(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public void spread(String storeName) {
        System.out.printf("I am '%s' and I am spreading in '%s'", this.getClass().getSimpleName(), storeName);
        if (this.getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
            System.out.println("whobl-whobl..");
        }
    }
}
