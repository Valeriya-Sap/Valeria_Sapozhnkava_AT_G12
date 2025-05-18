package homework.day1.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] arg) {
        Mouse m = new Mouse("Джерри", 5);
        TrainMethodsObjects x = new TrainMethodsObjects();
        x.processMouse(m);
        Souce s = new Souce("Шрирача", "красного");
        TrainMethodsObjects y = new TrainMethodsObjects();
        y.processSouce(s);
        Bee b = new Bee("Girl", 8);
        TrainMethodsObjects z = new TrainMethodsObjects();
        z.processBee(b);
        Obstacle o = new Obstacle("высокое", "не хватает времени");
        TrainMethodsObjects k = new TrainMethodsObjects();
        k.processObstacle(o);
        Pineapple p = new Pineapple("Gold", 3234);
        TrainMethodsObjects l = new TrainMethodsObjects();
        l.processPineapple(p);
    }
}
