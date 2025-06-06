package homework.day2.playground.runners;

import homework.day2.playground.essence.Flyable;
import homework.day2.playground.essence.craft.Rideable;
import homework.day2.playground.essence.craft.Transportable;
import homework.day2.playground.essence.craft.air.Aircraft;
import homework.day2.playground.essence.craft.air.Copter;
import homework.day2.playground.essence.craft.air.Plane;
import homework.day2.playground.essence.craft.air.Rocket;
import homework.day2.playground.essence.craft.field.Car;
import homework.day2.playground.essence.craft.field.Moped;
import homework.day2.playground.essence.craft.field.Motorbike;
import homework.day2.playground.essence.craft.field.Vehicle;
import homework.day2.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] arg) {
        TransportableProcessor transportableProcessor = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");
        transportableProcessor.runTransportable(aMotorbike);
        transportableProcessor.runTransportable(aMoped);
        transportableProcessor.runTransportable(aCar);
        transportableProcessor.runTransportable(aRocket);
        transportableProcessor.runTransportable(aPlane);
        transportableProcessor.runTransportable(aCopter);
        //transportableProcessor.runTransportable(rideableMotorbike); - так как тип объекта rideable, то объект не обладает методом интерфеса Transportable;
        //transportableProcessor.runTransportable(rideableMoped); - так как тип объекта rideable, то объект не обладает методом интерфеса Transportable;
        //transportableProcessor.runTransportable(rideableCar); - так как тип объекта rideable, то объект не обладает методом интерфеса Transportable;
        //transportableProcessor.runTransportable(flyableRocket); - так как тип объекта flyable, то объект не обладает методом интерфеса Transportable;
        //transportableProcessor.runTransportable(flyablePlane); - так как тип объекта flyable, то объект не обладает методом интерфеса Transportable;
        //transportableProcessor.runTransportable(flyableCopter); - так как тип объекта flyable, то объект не обладает методом интерфеса Transportable;
        transportableProcessor.runTransportable(vehicleMotorbike);
        transportableProcessor.runTransportable(vehicleMoped);
        transportableProcessor.runTransportable(vehicleCar);
        transportableProcessor.runTransportable(aircraftRocket);
        transportableProcessor.runTransportable(aircraftPlane);
        transportableProcessor.runTransportable(aircraftCopter);
        transportableProcessor.runTransportable(transportableMotorbike);
        transportableProcessor.runTransportable(transportableMoped);
        transportableProcessor.runTransportable(transportableCar);
        transportableProcessor.runTransportable(transportableRocket);
        transportableProcessor.runTransportable(transportablePlane);
        transportableProcessor.runTransportable(transportableCopter);
        transportableProcessor.runTransportable(transportableCopter, 23, 242);
        transportableProcessor.runTransportable(transportableCopter, 93, 7);
    }
}
