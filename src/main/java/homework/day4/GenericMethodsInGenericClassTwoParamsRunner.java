package homework.day4;

import homework.day2.playground.essence.craft.air.Copter;
import homework.day2.playground.essence.craft.air.Plane;
import homework.day2.playground.essence.craft.air.Rocket;
import homework.day2.playground.essence.craft.field.Car;
import homework.day2.playground.essence.craft.field.Moped;
import homework.day2.playground.essence.craft.field.Motorbike;
import homework.day2.playground.essence.craft.hand.Bottle;
import homework.day2.playground.essence.craft.hand.Can;
import homework.day2.playground.essence.craft.hand.Mug;
import homework.day2.playground.essence.creatures.*;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> twoString = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(twoString.genericMethodGenArgs("First"));
        System.out.println(twoString.genericMethodGenArgs("First", " and Second"));
        twoString.genericMethodHalfGenArgs("three", "retdcvyguhio");
        twoString.genericMethodHalfGenArgs("Four", "Five", "Valery");

        GenericMethodsInGenericClassTwoParams<String, Integer> treeString = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(treeString.genericMethodGenArgs("First"));
        System.out.println(treeString.genericMethodGenArgs("First", 3));
        treeString.genericMethodHalfGenArgs("three", "retdcvyguhio");
        treeString.genericMethodHalfGenArgs("Four", 4, "Valery");

        GenericMethodsInGenericClassTwoParams<String, Double> fourString = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(fourString.genericMethodGenArgs("First"));
        System.out.println(fourString.genericMethodGenArgs("First", 1.456));
        fourString.genericMethodHalfGenArgs("three", "retdcvyguhio");
        fourString.genericMethodHalfGenArgs("Four", 2.4567, "Valery");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> fiveString = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(fiveString.genericMethodGenArgs(1));
        System.out.println(fiveString.genericMethodGenArgs(1, 2));
        fiveString.genericMethodHalfGenArgs(1, "ihjk");
        fiveString.genericMethodHalfGenArgs(1, 2, "Valery");

        GenericMethodsInGenericClassTwoParams<Copter, Plane> sixGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(sixGeneric.genericMethodGenArgs(new Copter(1, "Copter1")));
        System.out.println(sixGeneric.genericMethodGenArgs(new Copter(1, "Copter1"), new Plane(1, "Plane1")));
        sixGeneric.genericMethodHalfGenArgs(new Copter(1, "Copter1"), "retdcvyguhio");
        sixGeneric.genericMethodHalfGenArgs(new Copter(1, "Copter1"), new Plane(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Rocket, Car> sevenGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(sevenGeneric.genericMethodGenArgs(new Rocket(1, "Rok1")));
        System.out.println(sevenGeneric.genericMethodGenArgs(new Rocket(1, "rok1"), new Car(1, "Caar1")));
        sevenGeneric.genericMethodHalfGenArgs(new Rocket(1, "Copter1"), "retdcvyguhio");
        sevenGeneric.genericMethodHalfGenArgs(new Rocket(1, "Copter1"), new Car(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> eightGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(eightGeneric.genericMethodGenArgs(new Moped(1, "Mop")));
        System.out.println(eightGeneric.genericMethodGenArgs(new Moped(1, "Moo"), new Motorbike(1, "Plane1")));
        eightGeneric.genericMethodHalfGenArgs(new Moped(1, "Copter1"), "retdcvyguhio");
        eightGeneric.genericMethodHalfGenArgs(new Moped(1, "Copter1"), new Motorbike(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Bottle, Can> nineGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(nineGeneric.genericMethodGenArgs(new Bottle(1, "Copter1")));
        System.out.println(nineGeneric.genericMethodGenArgs(new Bottle(1, "Copter1"), new Can(1, "Plane1")));
        nineGeneric.genericMethodHalfGenArgs(new Bottle(1, "Copter1"), "retdcvyguhio");
        nineGeneric.genericMethodHalfGenArgs(new Bottle(1, "Copter1"), new Can(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Mug, Beetle> tenGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(tenGeneric.genericMethodGenArgs(new Mug(1, "Copter1")));
        System.out.println(tenGeneric.genericMethodGenArgs(new Mug(1, "Copter1"), new Beetle(1, "Plane1")));
        tenGeneric.genericMethodHalfGenArgs(new Mug(1, "Copter1"), "retdcvyguhio");
        tenGeneric.genericMethodHalfGenArgs(new Mug(1, "Copter1"), new Beetle(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> eleGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(eleGeneric.genericMethodGenArgs(new Carrot(1, "Copter1")));
        System.out.println(eleGeneric.genericMethodGenArgs(new Carrot(1, "Copter1"), new Chamomile(1, "Plane1")));
        eleGeneric.genericMethodHalfGenArgs(new Carrot(1, "Copter1"), "retdcvyguhio");
        eleGeneric.genericMethodHalfGenArgs(new Carrot(1, "Copter1"), new Chamomile(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> tweGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(tweGeneric.genericMethodGenArgs(new Crocodile(1, "Copter1")));
        System.out.println(tweGeneric.genericMethodGenArgs(new Crocodile(1, "Copter1"), new Fly(1, "Plane1")));
        tweGeneric.genericMethodHalfGenArgs(new Crocodile(1, "Copter1"), "retdcvyguhio");
        tweGeneric.genericMethodHalfGenArgs(new Crocodile(1, "Copter1"), new Fly(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> thGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(thGeneric.genericMethodGenArgs(new Maylily(1, "Copter1")));
        System.out.println(thGeneric.genericMethodGenArgs(new Maylily(1, "Copter1"), new Mosquito(1, "Plane1")));
        thGeneric.genericMethodHalfGenArgs(new Maylily(1, "Copter1"), "retdcvyguhio");
        thGeneric.genericMethodHalfGenArgs(new Maylily(1, "Copter1"), new Mosquito(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> fGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(fGeneric.genericMethodGenArgs(new Pigeon(1, "Copter1")));
        System.out.println(fGeneric.genericMethodGenArgs(new Pigeon(1, "Copter1"), new Potato(1, "Plane1")));
        fGeneric.genericMethodHalfGenArgs(new Pigeon(1, "Copter1"), "retdcvyguhio");
        fGeneric.genericMethodHalfGenArgs(new Pigeon(1, "Copter1"), new Potato(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Radish, Raven> fiGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(fiGeneric.genericMethodGenArgs(new Radish(1, "Copter1")));
        System.out.println(fiGeneric.genericMethodGenArgs(new Radish(1, "Copter1"), new Raven(1, "Plane1")));
        fiGeneric.genericMethodHalfGenArgs(new Radish(1, "Copter1"), "retdcvyguhio");
        fiGeneric.genericMethodHalfGenArgs(new Radish(1, "Copter1"), new Raven(1, "Plane1"), "Valery");

        GenericMethodsInGenericClassTwoParams<Rose, Plane> sixteenGeneric = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(sixteenGeneric.genericMethodGenArgs(new Rose(1, "Copter1")));
        System.out.println(sixteenGeneric.genericMethodGenArgs(new Rose(1, "Copter1"), new Plane(1, "Plane1")));
        sixteenGeneric.genericMethodHalfGenArgs(new Rose(1, "Copter1"), "retdcvyguhio");
        sixteenGeneric.genericMethodHalfGenArgs(new Rose(1, "Copter1"), new Plane(1, "Plane1"), "Valery");
    }
}
