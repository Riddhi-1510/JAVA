class Car{
    String brand;
    String model;
    int year;
    String rentalStatus;

    Car(){
        brand = "Unknown";
        model = "Unknown";
        year = 2023;
        rentalStatus = "Available";
    }
    void printData(){
        System.out.println("Brand is : "+brand);
        System.out.println("Model is "+ model);
        System.out.println("YEar is : " + year);
        System.out.println("rentalStatus is : " + rentalStatus);
    }
};

public class task6 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.printData();
    }
}
/*

5. Car Rental System:
Design a "Car" class to represent cars available for rent in a car rental system. The class should have attributes like car brand, model, year, and rental status. The default constructor initializes the car with default values like "Unknown" for brand and model, year set to the current year, and rental status as "Available." Create an object of the "Car" class using the default constructor and display its details.
 */