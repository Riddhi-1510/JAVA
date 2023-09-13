interface Hotel{
    void bookRoom();
    void cancelRoom();
    void orderFood();
    void cancelFood();
    void roomService();
    // void checkIn();
    // void checkOut();
}

interface SmallHotel extends Hotel{
    void checkIn();
    void checkOut();
}

class TajHotel implements Hotel , SmallHotel{
    @Override
    public void bookRoom(){
        System.out.println("Book Room at Taj");
    }
    @Override
    public void cancelRoom(){
        System.out.println("Cancel Room at Taj");
    }
    @Override
    public void orderFood(){
        System.out.println("Order Food at Taj");
    }
    @Override 
    public void cancelFood(){
        System.out.println("Cancel Food at Taj");
    }
    @Override
    public void roomService(){
        System.out.println("Room Service at Taj");
    }
    @Override
    public void checkIn(){
        System.out.println("Check in at Taj");
    }
    @Override
    public void checkOut(){
        System.out.println("Check out at Taj");
    }
}
public class Interface {
    public static void main(String[] args) {
        // TajHotel taj = new TajHotel();
        // taj.bookRoom();
        // taj.cancelRoom();
        // taj.orderFood();
        // taj.cancelFood();
        // taj.roomService();
        // taj.checkIn();
        // taj.checkOut();

        SmallHotel gest = new SmallHotel() {//Annoymous Class
            @Override
            public void bookRoom(){
                System.out.println("Book Room at Taj");
            }
            @Override
            public void cancelRoom(){
                System.out.println("Cancel Room at Taj");
            }
            @Override
            public void orderFood(){
                System.out.println("Order Food at Taj");
            }
            @Override 
            public void cancelFood(){
                System.out.println("Cancel Food at Taj");
            }
            @Override
            public void roomService(){
                System.out.println("Room Service at Taj");
            }
            @Override
            public void checkIn(){
                System.out.println("Check in at Taj");
            }
            @Override
            public void checkOut(){
                System.out.println("Check out at Taj");
            }  
        };

        gest.bookRoom();
        gest.cancelFood();
        gest.cancelRoom();
    }
}

