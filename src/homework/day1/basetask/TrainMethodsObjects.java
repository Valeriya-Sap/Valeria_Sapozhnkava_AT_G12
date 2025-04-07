package homework.day1.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse m) {
        m.printMouseDetails();
        System.out.println(m.getName() + " " + m.getAge());
    }

    public void processSouce(Souce s) {
        s.printSouceDetails();
        System.out.println(s.getName() + " " + s.getColor());
    }

    public void processBee(Bee b) {
        b.printBeeDetails();
        System.out.println(b.getGender() + " " + b.getWeight());
    }

    public void processObstacle(Obstacle o) {
        o.printObstacleDetails();
        System.out.println(o.getSeverity() + " " + o.getDescription());
    }

    public void processPineapple(Pineapple p) {
        p.printPineappleDetails();
        System.out.println(p.getGrade() + " " + p.getHeatCapacity());
    }
}
