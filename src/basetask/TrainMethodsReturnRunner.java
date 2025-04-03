package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] arg) {
        TrainMethodsReturn x = new TrainMethodsReturn();
        System.out.println("TrainMethodsReturn.returnNewInt вернул " + x.returnNewInt(1));
        System.out.println("TrainMethodsReturn.returnNewLong вернул " + x.returnNewLong(1));
        System.out.println("TrainMethodsReturn.returnNewChar вернул " + x.returnNewChar('a'));
        System.out.println("TrainMethodsReturn.returnNewFloat вернул " + x.returnNewFloat((float) 1234.567));
        System.out.println("TrainMethodsReturn.returnNewDouble вернул " + x.returnNewDouble(123456.09876));
        System.out.println("TrainMethodsReturn.returnNewShort вернул " + x.returnNewShort((short) -1234));
        System.out.println("TrainMethodsReturn.returnNewByte вернул " + x.returnNewByte((byte) 45));
        System.out.println("TrainMethodsReturn.returnNewBoolean вернул " + x.returnNewBoolean(true));

    }

}
