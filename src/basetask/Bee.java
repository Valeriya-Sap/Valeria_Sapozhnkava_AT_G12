package basetask;

public class Bee {
    private String gender;
    private int weight;

    public Bee(String gender, int weight) {
        this.weight = weight;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int age) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weight + " раз");
    }
}
