abstract class TravelBooking{
    abstract void bookTicket();
    abstract void cancelBooking();
}

class FlightBooking extends TravelBooking{
    @Override
    public void bookTicket(){
        System.out.println("Book ticket For FLIGHT");
    }
    @Override
    public void cancelBooking(){
        System.out.println("Cancel ticket For FLIGHT");
    }
}

class HotelBooking extends TravelBooking{
    @Override
    public void bookTicket(){
        System.out.println("Book ticket For HOTEL");
    }

    @Override
    public void cancelBooking(){
        System.out.println("Cancel ticket For HOTEL");
    }
}
public class TravelBooking1 {
        public static void main(String[] args) {
            FlightBooking f = new FlightBooking();
            f.bookTicket();
            f.cancelBooking();

            HotelBooking h = new HotelBooking();
            h.bookTicket();
            h.cancelBooking();
        }
}
/*
Scenario 5: Travel Booking System
Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

 */
