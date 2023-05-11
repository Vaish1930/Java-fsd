package object_oriented_implementation;

// Demonstration of Abstract class 

public class Car extends Vehicle {
    @Override
    void stop() {
        System.out.println("Stopping!");
    }

    @Override
    void speedMeter() {
        System.out.println("500 kmph");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.speedMeter();
        car.stop();
    }
}