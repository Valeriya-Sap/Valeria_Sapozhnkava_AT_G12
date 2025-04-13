package homework.day2.playground.runners;

import homework.day2.playground.essence.Matter;
import homework.day2.playground.essence.craft.hand.Bottle;
import homework.day2.playground.essence.craft.hand.Can;
import homework.day2.playground.essence.craft.hand.Container;
import homework.day2.playground.essence.craft.hand.Storable;
import homework.day2.playground.essence.craft.material.*;
import homework.day2.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
    public static void main(String[] arg) {
        StorableProcessor storableProcessor = new StorableProcessor();
        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");
        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        //Matter matterPetrol = new Petrol(2); - Petrol не наследует класс  Matter;
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);
        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(bottle, pourablePetrol);
        storableProcessor.runStorable(bottle, pourableDiesel);
        //storableProcessor.runStorable(bottle, powerableDiesel); - неподходящий тип объекта powerableDiesel;
        storableProcessor.runStorable(bottle, water);
        storableProcessor.runStorable(bottle, pourableWater);
        storableProcessor.runStorable(storableBottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
        storableProcessor.runStorable(storableBottle, pourableDiesel);
        //storableProcessor.runStorable(storableBottle, powerableDiesel); - неподходящий тип объекта powerableDiesel;
        storableProcessor.runStorable(storableBottle, water);
        storableProcessor.runStorable(storableBottle, pourableWater);
        //storableProcessor.runStorable(containerBottle, petrol); - неподходящий тип объекта containerBottle;
        //storableProcessor.runStorable(containerBottle, pourablePetrol); - неподходящий тип объекта containerBottle;
        //storableProcessor.runStorable(containerBottle, pourableDiesel); - неподходящий тип объекта containerBottle;
        //storableProcessor.runStorable(containerBottle, powerableDiesel); - неподходящий типы объектов powerableDiesel и containerBottle;
        //storableProcessor.runStorable(containerBottle, water); - неподходящий тип объекта containerBottle;
        //storableProcessor.runStorable(containerBottle, pourableWater); - неподходящий тип объекта containerBottle;
        //storableProcessor.runStorable(matterBottle, petrol); - неподходящий тип объекта matterBottle;
        //storableProcessor.runStorable(matterBottle, pourablePetrol); - неподходящий тип объекта matterBottle;
        //storableProcessor.runStorable(matterBottle, pourableDiesel); - неподходящий тип объекта matterBottle;
        //storableProcessor.runStorable(matterBottle, powerableDiesel); - неподходящий типы объектов powerableDiesel и matterBottle;
        //storableProcessor.runStorable(matterBottle, water); - неподходящий тип объекта matterBottle;
        //storableProcessor.runStorable(matterBottle, pourableWater); - неподходящий тип объекта matterBottle;
        storableProcessor.runStorable(can, petrol);
        storableProcessor.runStorable(can, pourablePetrol);
        storableProcessor.runStorable(can, pourableDiesel);
        //storableProcessor.runStorable(can, powerableDiesel); - неподходящий тип объекта powerableDiesel;
        storableProcessor.runStorable(can, water);
        storableProcessor.runStorable(can, pourableWater);
        storableProcessor.runStorable(storableCan, petrol);
        storableProcessor.runStorable(storableCan, pourablePetrol);
        storableProcessor.runStorable(storableCan, pourableDiesel);
        //storableProcessor.runStorable(storableCan, powerableDiesel); - неподходящий тип объекта powerableDiesel;
        storableProcessor.runStorable(storableCan, water);
        storableProcessor.runStorable(storableCan, pourableWater);
        //storableProcessor.runStorable(containerCan, petrol); - неподходящий тип объекта containerCan;
        //storableProcessor.runStorable(containerCan, pourablePetrol); - неподходящий тип объекта containerCan;
        //storableProcessor.runStorable(containerCan, pourableDiesel); - неподходящий тип объекта containerCan;
        //storableProcessor.runStorable(containerCan, powerableDiesel); - неподходящий типы объектов powerableDiesel и containerCan;
        //storableProcessor.runStorable(containerCan, water); - неподходящий тип объекта containerCan;
        //storableProcessor.runStorable(containerCan, pourableWater); - неподходящий тип объекта containerCan;
        //storableProcessor.runStorable(matterCan, petrol); - неподходящий тип объекта matterCan;
        //storableProcessor.runStorable(matterCan, pourablePetrol); - неподходящий тип объекта matterCan;
        //storableProcessor.runStorable(matterCan, pourableDiesel); - неподходящий тип объекта matterCan;
        //storableProcessor.runStorable(matterCan, powerableDiesel); - неподходящий типы объектов powerableDiesel и matterCan;
        //storableProcessor.runStorable(matterCan, water); - неподходящий тип объекта matterCan;
        //storableProcessor.runStorable(matterCan, pourableWater); - неподходящий тип объекта matterCan;

    }
}
