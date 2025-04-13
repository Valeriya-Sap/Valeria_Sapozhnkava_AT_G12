package homework.day2.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for F units", this.getClass().getSimpleName(), this.name, distance));
        System.out.println("wr-wr-wrr-r..");

    }
}
