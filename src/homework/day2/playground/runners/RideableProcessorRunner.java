package homework.day2.playground.runners;

import homework.day2.playground.essence.craft.Rideable;
import homework.day2.playground.essence.craft.field.Car;
import homework.day2.playground.essence.craft.field.Moped;
import homework.day2.playground.essence.craft.field.Motorbike;
import homework.day2.playground.essence.craft.field.Vehicle;
import homework.day2.playground.processors.RideableProcessor;

public class RideableProcessorRunner {
    public static void main(String[] arg) {
        RideableProcessor rideableProcessor = new RideableProcessor();
        Rideable rideableCar = new Car(223, "Lada Rideable");
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");
        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");
        Car aCar = new Car(223, "Lada Car");
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");
        Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle") {
        };
        Rideable anonymousRideable = new Rideable() {
            String name = "Anonymous";

            @Override
            public void drive(String direction) {
                System.out.printf("I am %s, my name is %s and I amd drive to %s%n",
                        this.getClass().getSimpleName(), this.name, direction);
            }
        };
        rideableProcessor.runRideable(rideableCar);
        rideableProcessor.runRideable(rideableMoped);
        rideableProcessor.runRideable(rideableMotorbike);
        rideableProcessor.runRideable(vehicleCar);
        rideableProcessor.runRideable(vehicleMoped);
        rideableProcessor.runRideable(vehicleMotorbike);
        rideableProcessor.runRideable(aCar);
        rideableProcessor.runRideable(aMoped);
        rideableProcessor.runRideable(aMotorbike);
        rideableProcessor.runRideable(anonymousVehicle);
        rideableProcessor.runRideable(anonymousRideable);
        rideableProcessor.runRideable(rideableCar, "никуда");
        rideableProcessor.runRideable(rideableCar, "повсюду");
    }
}
