package homework.day2.playground.essence.craft.material;

public class Diesel implements Pourable, Powerable {
    protected int mass;

    public Diesel(int mass) {
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
        System.out.println("whooh..");
    }
}
