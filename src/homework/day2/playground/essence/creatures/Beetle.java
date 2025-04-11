package homework.day2.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(String name, int mass) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (home.getMass() > this.mass) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", this.name, home.getName()));
        } else {
            System.out.println("This carrot is too small for nesting :( ");
        }
    }
}
