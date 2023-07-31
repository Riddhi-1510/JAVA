class TemperatureSensor{
    String tempretureReading;
    String sensorId;
    String Location;
    TemperatureSensor(){
        tempretureReading = "Unknown";
        sensorId = "Unknown";
        Location = "Unspecified";
    }
    void printData(){
        System.out.println("TempretureReading is : " + tempretureReading);
        System.out.println("SensoreID is : " + sensorId);
        System.out.println("Location is : " + Location);
    }
};

public class task4 {
    public static void main(String[] args) {
        TemperatureSensor obj = new TemperatureSensor();
        obj.printData();
    }
}

/*
3. Temperature Sensor:
Imagine you are working on an Internet of Things (IoT) project involving temperature sensors. Create a "TemperatureSensor" class with data members to store the current temperature reading, sensor ID, and location. The default constructor initializes the sensor with a default temperature value, sets the ID as "Unknown," and location as "Unspecified." Create an object of the "TemperatureSensor" class using the default constructor and display its properties.
 */