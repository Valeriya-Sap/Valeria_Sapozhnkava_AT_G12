package homework.day2.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (home.getMass() > this.mass) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", this.name, home.getName()));
        } else {
            System.out.println("This carrot is too small for nesting :( ");
        }


    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for %d units", this.getClass(), this.name, direction, distance));
        System.out.println("vz-vz-vzz-zz..");

    }
}
