
class Animal{
    String Animaltype;
    Animal(){
        Animaltype = "";
    }
}
class Mammal extends Animal{
    Mammal(){
        Animaltype = "Mammal";
    }
    void display(){
        System.out.println("Animal type is : " + Animaltype);
    }
}
class Bird extends Animal{
    Bird(){
        Animaltype = "Bird";
    }
    void display(){
        System.out.println("Animal type is : " + Animaltype);
    }
}
class Fish extends Animal{
    Fish(){
        Animaltype = "Fish";
    }
    void display(){
        System.out.println("Animal type is : " + Animaltype);
    }
}
public class q_i3 {
    public static void main(String[] args) {
        Mammal obj1 = new Mammal();
        obj1.display();
        Bird obj2 = new Bird();
        obj2.display();
        Fish obj3 = new Fish();
        obj3.display();
    }
}

/*

Scenario 3: Animal Kingdom
Design an animal kingdom hierarchy with a base class called "Animal" and derived classes like "Mammal," "Bird," and "Fish." Each derived class can have specific characteristics and behaviors unique to that group of animals.

 */
