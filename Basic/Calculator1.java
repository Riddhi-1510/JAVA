class Calc{
    void adding(int a, int b){
        System.out.println("Addition of two int " + (a+b));
    }
    void adding(double a, double b){
        System.out.println("Addition of two double " + (a+b));
    }
    void adding(int a, int b ,int c){
        System.out.println("Addtion of three int " + (a+b+c));
    }
}

public class Calculator1 {
    public static void main(String[] args) {
            Calc c = new Calc();
            c.adding(1,2);
            c.adding(11.2,22.2);
            c.adding(1,2,3);
    }
}
/*
Scenario 1: Calculator
In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.
 */
