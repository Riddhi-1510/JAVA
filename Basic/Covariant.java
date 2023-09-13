class Animal{
    Animal makeSound(){
        System.out.println("Animal....|||...Sound");
        return this;
    }
}
class Dog{
    Dog makeSound(){
        System.out.println("Dog--Sound");
        return this;
    }
}

class Cat{
    Cat makeSound(){
        System.out.println("Cat--Sound");
        return this;
    }
}
public class Covariant {
    public static void main(String[] args) {
           Animal a = new Animal();
           a = a.makeSound();
           Cat c = new Cat();
           c = c.makeSound();
           Dog d = new Dog();
           d = d.makeSound();
    }
}

/*
Scenario 1: Animal Sounds
In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

 */