package homework.day1.basetask;

public class Souce {
    private String name;
    private String color;

    public Souce(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }
}
