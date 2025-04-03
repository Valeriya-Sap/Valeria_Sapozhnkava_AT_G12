package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] arg) {
        TrainMethodsIf x = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + x.returnNewInt(9));
        System.out.println("метод returnNewLong вернул " + x.returnNewLong(300));
        System.out.println("метод returnNewInt вернул " + x.returnNewChar('K'));
        System.out.println("метод returnNewInt вернул " + x.returnNewFloat((float) 478.98));
        System.out.println("метод returnNewInt вернул " + x.returnNewDouble(456));
        x.returnNewBoolean(false);
    }
}
