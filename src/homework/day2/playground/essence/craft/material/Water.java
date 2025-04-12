package homework.day2.playground.essence.craft.material;

public class Water implements Pourable{
    @Override
    public void spread(String storeName) {
        System.out.printf("I am '%s' and I am spreading in '%s'", this.getClass(), storeName);
        if (this.getClass() == this.getClass()){
            System.out.println ("whobl-whobl..");
        }
    }
}
