interface Flyable{
    void fly_obj();
}
class SpaceCraft implements Flyable{
    public void fly_obj(){
        System.out.println("SpaceCraft");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter");
    }
}

public class SampleInterfaceFlyable {
    public static void main(String[] args) {
            SpaceCraft s = new SpaceCraft();
            Airplane a = new Airplane();
            Helicopter h = new Helicopter();
            s.fly_obj();
            a.fly_obj();
            h.fly_obj();
    }
}
