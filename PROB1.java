interface Engine {
    void start();
    void stop();
}

interface Features {
    void accelerate();
    void brake();
}

abstract class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println(make + " " + model + " " + year);
        
    }
}

class Car extends Vehicle implements Engine, Features {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void start() {
        System.out.println("Starting the car's engine.");
    }

    public void stop() {
        System.out.println("Stopping the car's engine.");
    }

    public void accelerate() {
        System.out.println("Accelerating the car.");
    }

    public void brake() {
        System.out.println("Applying the brakes to the car.");
    }
}

public class PROB1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}