package homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] arg) {
        System.out.println("Cycle While");
        CycleWhile a = new CycleWhile();
        a.cycleWhile();
        System.out.println("\nCycle For");
        CycleFor b = new CycleFor();
        b.cycleFor();
        System.out.println("\nArray Direct Order:");
        RandomArray c = new RandomArray();
        c.randomArrayDirectOrder();
        System.out.println("\nReverse Order:");
        c.arrayReverseOrder();
        System.out.println("\n* 5:");
        c.multiplicationByFive();
        System.out.println("\n^2:");
        c.raiseToThePower();
        System.out.println("\nMin Item");
        c.minItem();
        System.out.println("\nSwap First and Last Item");
        c.swapFirstAndLast();
        System.out.println("\nSorting");
        c.sortingArray();
    }
}
