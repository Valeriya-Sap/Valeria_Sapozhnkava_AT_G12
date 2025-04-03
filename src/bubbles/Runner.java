package bubbles;

public class Runner {
    public static void main(String[] arg) {
        System.out.println("First bottle:");
        Bottle one = new Bottle(0.5);
        one.fill();
        one.open();
        System.out.println("Second bottle:");
        Bottle two = new Bottle(1);
        two.fill();
        two.open();
        System.out.println("Third bottle:");
        Bottle three = new Bottle(1.5);
        three.fill();
        three.open();
    }


}
