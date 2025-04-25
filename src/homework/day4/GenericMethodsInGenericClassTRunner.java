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
import homework.day2.playground.essence.craft.material.Diesel;
import homework.day2.playground.essence.craft.material.Petrol;
import homework.day2.playground.essence.craft.material.Water;
import homework.day2.playground.essence.creatures.Pigeon;
import homework.day2.playground.essence.creatures.*;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> myString = new GenericMethodsInGenericClassT<>();
        myString.genericMethodOneGenArg("First");
        System.out.println(myString.genericMethodTwoGenArgs("First", " and Second"));
        myString.genericMethodHalfGenArgs("First", "WErtygxhwschbw wudhfwug");
        GenericMethodsInGenericClassT<Integer> myInteger = new GenericMethodsInGenericClassT<>();
        myInteger.genericMethodOneGenArg(1);
        System.out.println(myInteger.genericMethodTwoGenArgs(1, 2));
        myInteger.genericMethodHalfGenArgs(1, "WErtygxhwschbw wudhfregffwug");
        GenericMethodsInGenericClassT<Double> myDouble = new GenericMethodsInGenericClassT<>();
        myDouble.genericMethodOneGenArg(1.45678);
        System.out.println(myDouble.genericMethodTwoGenArgs(1.34567, 2.876));
        myDouble.genericMethodHalfGenArgs(1.3456, "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Copter> myCopter = new GenericMethodsInGenericClassT<>();
        Copter copter1 = new Copter(1, "Copter1");
        Copter copter2 = new Copter(2, "Copter2");
        myCopter.genericMethodOneGenArg(copter1);
        System.out.println(myCopter.genericMethodTwoGenArgs(copter1, copter2));
        myCopter.genericMethodHalfGenArgs(copter1, "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Plane> myPlane = new GenericMethodsInGenericClassT<>();
        myPlane.genericMethodOneGenArg(new Plane(1, "Plane1"));
        System.out.println(myPlane.genericMethodTwoGenArgs(new Plane(1, "Plane1"), new Plane(2, "Plane2")));
        myPlane.genericMethodHalfGenArgs(new Plane(1, "Plane1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Rocket> myRocket = new GenericMethodsInGenericClassT<>();
        myRocket.genericMethodOneGenArg(new Rocket(1, "Rocket1"));
        System.out.println(myRocket.genericMethodTwoGenArgs(new Rocket(1, "Rocket1"), new Rocket(2, "Rocket2")));
        myRocket.genericMethodHalfGenArgs(new Rocket(1, "Rocket1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Car> myCar = new GenericMethodsInGenericClassT<>();
        myCar.genericMethodOneGenArg(new Car(1, "Car1"));
        System.out.println(myCar.genericMethodTwoGenArgs(new Car(1, "Car1"), new Car(2, "Car2")));
        myCar.genericMethodHalfGenArgs(new Car(1, "Car1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Moped> myMoped = new GenericMethodsInGenericClassT<>();
        myMoped.genericMethodOneGenArg(new Moped(1, "Moped1"));
        System.out.println(myMoped.genericMethodTwoGenArgs(new Moped(1, "Moped1"), new Moped(2, "Moped2")));
        myMoped.genericMethodHalfGenArgs(new Moped(1, "Moped1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Motorbike> myMotorbike = new GenericMethodsInGenericClassT<>();
        myMotorbike.genericMethodOneGenArg(new Motorbike(1, "Motorbike1"));
        System.out.println(myMotorbike.genericMethodTwoGenArgs(new Motorbike(1, "Motorbike1"), new Motorbike(2, "Motorbike2")));
        myMotorbike.genericMethodHalfGenArgs(new Motorbike(1, "Motorbike1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Bottle> myBottle = new GenericMethodsInGenericClassT<>();
        myBottle.genericMethodOneGenArg(new Bottle(1, "Bottle1"));
        System.out.println(myBottle.genericMethodTwoGenArgs(new Bottle(1, "Bottle1"), new Bottle(2, "Bottle2")));
        myBottle.genericMethodHalfGenArgs(new Bottle(1, "Bottle"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Can> myCan = new GenericMethodsInGenericClassT<>();
        myCan.genericMethodOneGenArg(new Can(1, "Can1"));
        System.out.println(myCan.genericMethodTwoGenArgs(new Can(1, "Can1"), new Can(2, "Can2")));
        myCan.genericMethodHalfGenArgs(new Can(1, "Can1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Mug> myMug = new GenericMethodsInGenericClassT<>();
        myMug.genericMethodOneGenArg(new Mug(1, "Mug1"));
        System.out.println(myMug.genericMethodTwoGenArgs(new Mug(1, "Mug1"), new Mug(2, "Mug2")));
        myMug.genericMethodHalfGenArgs(new Mug(1, "Mug1"), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Diesel> myDiesel = new GenericMethodsInGenericClassT<>();
        myDiesel.genericMethodOneGenArg(new Diesel(1));
        System.out.println(myDiesel.genericMethodTwoGenArgs(new Diesel(1), new Diesel(2)));
        myDiesel.genericMethodHalfGenArgs(new Diesel(1), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Petrol> myPetrol = new GenericMethodsInGenericClassT<>();
        myPetrol.genericMethodOneGenArg(new Petrol(1));
        System.out.println(myPetrol.genericMethodTwoGenArgs(new Petrol(1), new Petrol(2)));
        myPetrol.genericMethodHalfGenArgs(new Petrol(1), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Water> myWater = new GenericMethodsInGenericClassT<>();
        myWater.genericMethodOneGenArg(new Water(1));
        System.out.println(myWater.genericMethodTwoGenArgs(new Water(1), new Water(2)));
        myWater.genericMethodHalfGenArgs(new Water(1), "WErtygxhwschgffwug");
        GenericMethodsInGenericClassT<Beetle> myBeetle = new GenericMethodsInGenericClassT<>();
        myBeetle.genericMethodOneGenArg(new Beetle(1, "Beetle1"));
        System.out.println(myBeetle.genericMethodTwoGenArgs(new Beetle(1, "Beetle1"), new Beetle(2, "Beetle2")));
        myBeetle.genericMethodHalfGenArgs(new Beetle(1, "Beetle1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Carrot> myCarrot = new GenericMethodsInGenericClassT<>();
        myCarrot.genericMethodOneGenArg(new Carrot(1, "Carrot1"));
        System.out.println(myCarrot.genericMethodTwoGenArgs(new Carrot(1, "Carrot1"), new Carrot(2, "Carrot2")));
        myCarrot.genericMethodHalfGenArgs(new Carrot(1, "Carrot1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Chamomile> myChamomile = new GenericMethodsInGenericClassT<>();
        myChamomile.genericMethodOneGenArg(new Chamomile(1, "Chamomile1"));
        System.out.println(myChamomile.genericMethodTwoGenArgs(new Chamomile(1, "Chamomile1"), new Chamomile(2, "Chamomile2")));
        myChamomile.genericMethodHalfGenArgs(new Chamomile(1, "Chamomile1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Crocodile> myCrocodile = new GenericMethodsInGenericClassT<>();
        myCrocodile.genericMethodOneGenArg(new Crocodile(1, "Crocodile1"));
        System.out.println(myCrocodile.genericMethodTwoGenArgs(new Crocodile(1, "Crocodile1"), new Crocodile(2, "Crocodile2")));
        myCrocodile.genericMethodHalfGenArgs(new Crocodile(1, "Crocodile1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Fly> myFly = new GenericMethodsInGenericClassT<>();
        myFly.genericMethodOneGenArg(new Fly(1, "Fly1"));
        System.out.println(myFly.genericMethodTwoGenArgs(new Fly(1, "Fly1"), new Fly(2, "Fly2")));
        myFly.genericMethodHalfGenArgs(new Fly(1, "Fly1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Maylily> myMaylily = new GenericMethodsInGenericClassT<>();
        myMaylily.genericMethodOneGenArg(new Maylily(1, "Maylily1"));
        System.out.println(myMaylily.genericMethodTwoGenArgs(new Maylily(1, "Maylily1"), new Maylily(2, "Maylily2")));
        myMaylily.genericMethodHalfGenArgs(new Maylily(1, "Maylily1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Mosquito> myMosquito = new GenericMethodsInGenericClassT<>();
        myMosquito.genericMethodOneGenArg(new Mosquito(1, "Mosquito1"));
        System.out.println(myMosquito.genericMethodTwoGenArgs(new Mosquito(1, "Mosquito1"), new Mosquito(2, "Mosquito2")));
        myMosquito.genericMethodHalfGenArgs(new Mosquito(1, "Mosquito1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Pigeon> myPigeon = new GenericMethodsInGenericClassT<>();
        myPigeon.genericMethodOneGenArg(new Pigeon(1, "Pigeon1"));
        System.out.println(myPigeon.genericMethodTwoGenArgs(new Pigeon(1, "Pigeon1"), new Pigeon(2, "Pigeon2")));
        myPigeon.genericMethodHalfGenArgs(new Pigeon(1, "Pigeon1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Potato> myPotato = new GenericMethodsInGenericClassT<>();
        myPotato.genericMethodOneGenArg(new Potato(1, "Potato1"));
        System.out.println(myPotato.genericMethodTwoGenArgs(new Potato(1, "Potato1"), new Potato(2, "Potato2")));
        myPotato.genericMethodHalfGenArgs(new Potato(1, "Potato1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Radish> myRadish = new GenericMethodsInGenericClassT<>();
        myRadish.genericMethodOneGenArg(new Radish(1, "Radish1"));
        System.out.println(myRadish.genericMethodTwoGenArgs(new Radish(1, "Radish1"), new Radish(2, "Radish2")));
        myRadish.genericMethodHalfGenArgs(new Radish(1, "Radish1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Raven> myRaven = new GenericMethodsInGenericClassT<>();
        myRaven.genericMethodOneGenArg(new Raven(1, "Raven1"));
        System.out.println(myRaven.genericMethodTwoGenArgs(new Raven(1, "Raven1"), new Raven(2, "Raven2")));
        myRaven.genericMethodHalfGenArgs(new Raven(1, "Raven1"), "WErtygxhwschgffwug");

        GenericMethodsInGenericClassT<Rose> myRose = new GenericMethodsInGenericClassT<>();
        myRose.genericMethodOneGenArg(new Rose(1, "Rose1"));
        System.out.println(myRose.genericMethodTwoGenArgs(new Rose(1, "Rose1"), new Rose(2, "Rose2")));
        myRose.genericMethodHalfGenArgs(new Rose(1, "Rose1"), "WErtygxhwschgffwug");
    }
}
