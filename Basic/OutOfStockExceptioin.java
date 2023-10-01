import java.util.Scanner;

class OutOfStockException extends Exception{
    OutOfStockException(String s){
        super(s);
    }
}
public class OutOfStockExceptioin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items[] = new int[3];
        for(int i=0;i<3;i++){
            items[i] = 5;
        }
        int choice,itemN;
       
        while(true){
            System.out.println("1---pen");
            System.out.println("2---notebook");
            System.out.println("3---charger");
            System.out.println("4---Exit");
            System.out.println("Enter Your choice : ");choice = scan.nextInt();
            System.out.println("Enter Number of Item : ");itemN = scan.nextInt();
            
            switch(choice){
                case 1 : try{
                        items[0] = items[0]-itemN;
                        availableOrNot(items[0]);
                        }catch(OutOfStockException e){
                            System.out.println(e.getClass());
                            System.out.println(e.getMessage());
                        }
                break;
                case 2 : try{
                            items[1] = items[1]-itemN;
                            availableOrNot(items[1]);
                        }catch(OutOfStockException e){
                            System.out.println(e.getClass());
                            System.out.println(e.getMessage());
                        }
                break;
                case 3 :try{
                            items[2] = items[2]-itemN;
                            availableOrNot(items[2]);
                        }catch(OutOfStockException e){
                            System.out.println(e.getClass());
                            System.out.println(e.getMessage());
                        }
                break;
                case 4  : System.exit(0);
                break;
            }
        }
    }
    public static void  availableOrNot(int x) throws OutOfStockException{
        if(x<0){
            throw new OutOfStockException("Product is Not available ");
        }else{
            System.out.println("Product is Available : ");
        }
    }
}

/*
1. Online Shopping Cart:
   - Scenario: In an online shopping application, a customer tries to add a product to their cart, but the product is out of stock.
   - Exception: Create a custom "OutOfStockException" and handle it when adding items to the cart.
 */