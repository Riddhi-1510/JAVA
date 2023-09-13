interface PaymentGateway{
    void processPayment();
    void refundPayment();
}

class PaypalProcessor implements PaymentGateway{
    @Override
    public void processPayment(){
        System.out.println("(PaypalProcessor)--->Payment");
    }
    @Override
    public void refundPayment(){
        System.out.println("(PaypalProcessor)--->refund");
    }
}

class StripeGateway implements PaymentGateway{
    @Override
    public void processPayment(){
        System.out.println("(StripeGateWay)--->Payment");
    }
    @Override
    public void refundPayment(){
        System.out.println("(StripeGateWay)--->refund");
    }
}
public class PaymentGateway1 {
   public static void main(String[] args) {
        PaypalProcessor p = new PaypalProcessor();
        p.processPayment();
        p.refundPayment();

        StripeGateway s = new StripeGateway();
        s.processPayment();
        s.refundPayment();
   } 
}

/*
 
Scenario 1: Payment Gateway Integration
Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

 */