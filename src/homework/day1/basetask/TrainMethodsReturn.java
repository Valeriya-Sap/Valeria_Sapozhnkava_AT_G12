package homework.day1.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int a) {
        int b = a * 3;
        return b;
    }

    public long returnNewLong(long c) {
        long d = c - 4;
        return d;
    }

    public String returnNewChar(char e) {

        return e + "" + e;
    }

    public float returnNewFloat(float f) {
        return f / 2;
    }

    public double returnNewDouble(double g) {
        return g + 8;
    }

    public short returnNewShort(short h) {
        return (short) (h - 1);
    }

    public byte returnNewByte(byte j) {
        return (byte) (j * 2);
    }

    public boolean returnNewBoolean(boolean k) {
        return !k;
    }

}
