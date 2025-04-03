package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] arg) {
        TrainMethodsPrimitive x = new TrainMethodsPrimitive();
        x.printChar('c');
        x.printInt(1);
        x.printLong(1234567890);
        x.printFloat(15.567F);
        x.printDouble(987345676.64567);
        short f = -13568;
        x.printShort(f);
        byte g = 127;
        x.printByte(g);
        x.printBoolean(true);
    }
}
