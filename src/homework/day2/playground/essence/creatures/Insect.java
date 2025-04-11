package homework.day2.playground.essence.creatures;

public abstract class Insect extends Animal{
    public Insect(String name, int mass) {
        super(name, mass);
    }
    public void eat(Insect food) {
        String text = String.format("I am %s and I am eating %s", this.getName(), food.getName());
        System.out.println(text);
    }
}
