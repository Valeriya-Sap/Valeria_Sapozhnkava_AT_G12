package homework.day2.playground.processors;

import homework.day2.playground.essence.Flyable;
import homework.day2.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable){
        flyable.fly(DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction){
        flyable.fly(direction);
    }
}
