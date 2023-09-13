class Vehicle{
    void rent(){
        System.out.println("This is Rent Method....of...P");
    }
}
class Car extends Vehicle{
    @Override
    void rent(){
        System.out.println("This is Rent Method ---- For ----- Car");
    }
}
class Motorcycle extends Vehicle{
    @Override
    void rent(){
        System.out.println("This is Rent Method ---- For ----- Motorcycle");
    }
}

public class Runtime_Polymorphism {
        public static void main(String[] args) {
            Vehicle v = new Car();
            v.rent();
            
            Car s = (Car)v;
            s.rent();


            v = new Motorcycle();
            v.rent();
            
            Motorcycle m = (Motorcycle)v;
            m.rent();


        }
}

/*
Scenario 1: Vehicle Rental System
In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.



Upcasting: Converting a subclass object to a superclass object (implicit/Static Binding)
Downcasting: Converting a superclass object to a subclass object (explicit/Dynamic Binding)


        bank = new SBI();
        bank.getInterestRate(); //8%
        SBI sbi = (SBI) bank; //Downcasting
        sbi.getInterestRate(); //8%
        
*/