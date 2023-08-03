class StaticUtility{
    
    static int a,b,ans;
    StaticUtility(int a,int b){
        this.a = a;
        this.b = b;
    }
    static void sum(){
        ans = a + b;
        System.out.println("ans is : " + ans);
    }
    static void sub(){
        ans = a - b;
        System.out.println("ans is : " + ans);
    }
    static void mul(){
        ans = a * b;
        System.out.println("ans is : " + ans);
    }
    static void div(){
        ans = a / b;
        System.out.println("ans is : " + ans);
    }
};


public class StaticE1 {

    public static void main(String[] args) {
            StaticUtility obj = new StaticUtility(12, 4);
            StaticUtility.sum();
            StaticUtility.sub();
            StaticUtility.mul();
            StaticUtility.div();
    }
}
/*
1. Static Utility Class for Math Operations:
Problem Statement: Create a static utility class in Java that contains static methods for basic math operations such as addition, subtraction, multiplication, and division.


 */