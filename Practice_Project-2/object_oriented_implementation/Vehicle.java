package object_oriented_implementation;

// Demonstration of Abstract class 

abstract class Vehicle {
    void start() {
        System.out.println("Starting!");
    }

    abstract void stop();

    abstract void speedMeter();
    // cannot provide body to a abstarct function
}
// we cannot create instance of a abstract class
