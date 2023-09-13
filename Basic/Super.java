class Vehicle {
    void manufacture() {
        System.out.println("(P)Store Common manufacturing steps....");
    }
}

class Car extends Vehicle {
    void manufacture() {
        super.manufacture();
        System.out.println("(C)Store Common manufacturing steps....");
    }
}

public class Super {
    public static void main(String[] args) {
        Car c = new Car();
        c.manufacture();
    }
}

/*
 * 
 * Scenario 1: Car Manufacturing
 * In a car manufacturing system, have a base class called "Vehicle" with a
 * method called "manufacture" that handles common manufacturing steps.
 * Implement a derived class called "Car" that overrides the "manufacture"
 * method and uses the super keyword to invoke the base class implementation.
 * --random change
 */