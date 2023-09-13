
import java.util.Scanner;
class Vehicle{
    protected int VehiclePrice;
    Vehicle(){
        VehiclePrice = 0;
    }
}
class Car extends Vehicle{
    private String carCom;
    Car(){
        VehiclePrice = 5000000;
        carCom = "VW"; 
    }
    void display(){
        System.out.println("Car PRice is : " + VehiclePrice);
        System.out.println("Car COm is : " + carCom);
    }
}
class Motorcycle extends Vehicle{
    private String motorCycleCom;
    Motorcycle(){
        VehiclePrice = 1200000;
        motorCycleCom = "Activa"; 
    }  
    void display(){
        System.out.println("MotorCycle price is : " + VehiclePrice);
        System.out.println("MotorCycle com is : " + motorCycleCom);
    }
}
class Truck extends Vehicle{
    private String truckcom;
    Truck(){
        VehiclePrice = 4000000;
        truckcom = "volve";
    }
    void display(){
        System.out.println("Truck price is : " + VehiclePrice);
        System.out.println("Truck COm is : " + truckcom);
    }
}

public class q_i1 {
    public static void main(String[] args) {
        Car obj_1 = new Car();
        Motorcycle obj_2 = new Motorcycle();
        Truck obj_3 = new Truck();
        obj_1.display();
        obj_2.display();
        obj_3.display();
    }
}


/*
 * 
Scenario 1: Vehicle Hierarchy
Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.
 */