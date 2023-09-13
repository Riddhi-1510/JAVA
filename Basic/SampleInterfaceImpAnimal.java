interface Animal{
    void bark();
}

class Dog implements Animal{
    public void bark(){
        System.out.println("The dog barks...");
    }
}
public class SampleInterfaceImpAnimal {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.bark();
    }
}

