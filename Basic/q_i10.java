class MenuItem{
    int price = 0;
}
class Appetizer extends MenuItem{
    Appetizer(int price){
        this.price = price;
    }
    int add(){
        return (price);
    }
}
class MainCourse extends MenuItem{
    MainCourse(int price){
        this.price=price;
    }
    int add(){
        return (price);
    }
}
class Dessert extends MenuItem{
    Dessert(int price){
        this.price = price;
    }
    int add(){
        return (price);
    }
}

public class q_i10 {
    public static void main(String[] args) {
        int totalPrice = 0;
        Appetizer a = new Appetizer(100);
        totalPrice += a.add();
        MainCourse m = new MainCourse(500);
        totalPrice += m.add();
        Dessert d = new Dessert(200);
        totalPrice += d.add();
        System.out.println("Total Price is : " + totalPrice);
    }
}

/*
Scenario 10: Restaurant Menu
Create a restaurant menu system with a base class called "MenuItem" and derived classes like "Appetizer," "MainCourse," and "Dessert." Each derived class can have specific attributes like ingredients and methods related to that type of menu item.

 */