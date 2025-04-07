package cycletask;

import java.util.Random;

public class RandomArray {
    private int[] array = new int[7];
    Random random = new Random();

    public void randomArrayDirectOrder() {
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
    }

    public void arrayReverseOrder() {
        for (int i = 6; i < array.length && i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void multiplicationByFive() {
        for (int i = 0; i < array.length; i++) {
            int a = 5 * array[i];
            System.out.print(a + " ");
        }
    }

    public void raiseToThePower() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(Math.pow(array[i], 2) + " ");
        }
    }

    public void minItem() {
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a >= array[i]) {
                a = array[i];
            }
        }
        System.out.print(a);
    }

    public void swapFirstAndLast() {
        int a = array[0];
        array[0] = array[6];
        array[6] = a;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void sortingArray() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
