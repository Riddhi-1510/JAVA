interface GeolocationService{
    void getCurrentLocation();
    void calculateDistance();
}
class GoogleMapsService implements GeolocationService{
    @Override
    public void getCurrentLocation(){
        System.out.println("GoogleMap --> getCurrentLocation");
    }
    @Override
    public void calculateDistance(){
        System.out.println("GoogleMap --> calculateDistance");
    }
}

class HereMapsService implements GeolocationService{
    @Override
    public void getCurrentLocation(){
        System.out.println("HereMaps --> getCurrentLocation");
    }
    @Override
    public void calculateDistance(){
        System.out.println("HereMaps --> calculateDistance");
    }
}
public class Geolocation {

    public static void main(String[] args) {
         GoogleMapsService g = new GoogleMapsService();
         g.getCurrentLocation();
         g.calculateDistance();

         HereMapsService h = new HereMapsService();
         h.getCurrentLocation();
         h.calculateDistance();
    }
    
}
/*
Scenario 7: Geolocation Services
Design an interface called "GeolocationService" with methods like "getCurrentLocation" and "calculateDistance." Implement classes like "GoogleMapsService" and "HereMapsService" that provide specific implementations for these interface methods.

 */