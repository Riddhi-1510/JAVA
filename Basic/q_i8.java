
import java.util.Scanner;
class Vehicle{
    protected int VehicleRentPrice;
    Vehicle(){
        VehicleRentPrice= 0;
    }
}
class Car extends Vehicle{
    private String type;
    Car(){
        VehicleRentPrice = 10000;
        type = "Car"; 
    }
    void display(){
        System.out.println("Rent Price is : " + VehicleRentPrice);
        System.out.println("Vehicle type : " + type);
    }
}
class Motorcycle extends Vehicle{
    private String type;
    Motorcycle(){
        VehicleRentPrice = 1000;
        type = "Motorcycle"; 
    }  
    void display(){
        System.out.println("Rent price is : " + VehicleRentPrice);
        System.out.println("Vehicle type : " + type);
    }
}
class Truck extends Vehicle{
    private String type;
    Truck(){
       VehicleRentPrice = 5000;
        type = "Truck";
    }
    void display(){
        System.out.println("Rent price is : " + VehicleRentPrice);
        System.out.println("Vehicle type : " + type);
    }
}

public class q_i8 {
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
Scenario 8: Vehicle Rental System
Implement a vehicle rental system where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Each derived class can have its own rental rates and additional features specific to that type of vehicle.
 */