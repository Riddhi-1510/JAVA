interface OrderProcessor{
    public void placeOrder();
    public void cancelOrder();
}

class CreditCardProcessor implements OrderProcessor{
    @Override
    public void placeOrder() {
        System.out.println("(CreaditCarProcessor)Place Order ");
    }
    @Override
    public void cancelOrder(){
        System.out.println("(CreaditCarProcessor)Order is Cancel");
    }
}
class PayPalProcessor implements OrderProcessor{
    @Override
    public void placeOrder(){
        System.out.println("(PaypalProcessor)Place order--");
    }
    @Override
    public void cancelOrder(){
        System.out.println("(PaypalProcessor)Order is Cancel");
    }
}
public class OnlineOrder {
    public static void main(String[] args) {
        CreditCardProcessor c = new CreditCardProcessor();
        c.placeOrder();
        c.cancelOrder();

        PayPalProcessor p = new PayPalProcessor();
        p.placeOrder();
        p.cancelOrder();
    }
}

/*
Scenario 4: Online Ordering System
Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.
 */