package homework.day2.playground.processors;

import homework.day2.playground.essence.craft.Transportable;
import homework.day2.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int a = transportable.move(pointA, pointB);
        System.out.println(String.format("Transportable %s was moved to %d points", this.getClass().getSimpleName(), a));
    }

    public void runTransportable(Transportable transportable) {
        int b = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.println(String.format("Transportable %s was moved to %d points", this.getClass().getSimpleName(), b));
    }
}

