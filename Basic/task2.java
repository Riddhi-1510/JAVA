class ShoppingCart{
    public int items;
    public int totalCost;
    public String currency ;
    ShoppingCart(){
        items = 0;
        totalCost = 0;
        currency = "USD";
    }
   
    void printData(){
        System.out.println("items : " + items);
        System.out.println("totalCost : " + totalCost);
        System.out.println("currency : " + currency);
    }

};


public class task2 {
        public static void main(String[] args) {
            ShoppingCart obj = new ShoppingCart();  
            obj.items = 10;
            obj.totalCost = 1000;
            obj.currency = "INR";
            obj.printData();
        }
}

/*
1. Online Shopping Cart:
You are developing an online shopping website, and you need to implement a "ShoppingCart" class. The default constructor of this class will initialize the cart with default values such as an empty list of items, total cost set to zero, and a default currency (e.g., USD). Create an object of the "ShoppingCart" class using the default constructor and display the initial details of the cart.


*/
