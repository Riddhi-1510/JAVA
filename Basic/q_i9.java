import java.util.*;
class CartItem{
    String itemName;
    int price;
}
class ElectronicsItem extends CartItem{
    ElectronicsItem(String itemName,int price){
        this.itemName = itemName;
        this.price = price;
    }
    void printData(){
        System.out.println("Electronic Item Name is : "+itemName);
        System.out.println("Electronic Item Price is : " + price);
    }
}
class ClothingItem extends CartItem{
    ClothingItem(String itemName,int price){
        this.itemName = itemName;
        this.price = price;
    }
    void printData(){
        System.out.println("Clothing Item Name is : "+itemName);
        System.out.println("Clothing Item Price is : " + price);
    }
}
class BookItem extends CartItem{
    BookItem(String itemName,int price){
        this.itemName = itemName;
        this.price = price;
    }
    void printData(){
        System.out.println("Book Item Name is : "+itemName);
        System.out.println("Book Item Price is : " + price);
    }
}
public class q_i9 {
    public static void main(String[] args) {
        ElectronicsItem e = new ElectronicsItem("Mouse", 400);
        e.printData();
        ClothingItem c = new ClothingItem("T-shirt", 500);
        c.printData();
        BookItem b = new BookItem("Rich Dad Poor Dad", 300);
        b.printData();
    }
}

/*

Scenario 9: Online Shopping Cart
Design an online shopping cart system with a base class called "CartItem" and derived classes like "ElectronicsItem," "ClothingItem," and "BookItem." Each derived class can have its own attributes and behaviors related to that type of item.

 */