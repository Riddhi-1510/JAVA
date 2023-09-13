// final class MathConstants{
//     final double pi = 3.14;
//     final double e = 2.73;
//     // MathConstants(){
//     //     pi = 4.56;-->error
//     //     e = 2.3;-->error
//     // }
        // void method(){
        //     pi = 4.67;
        //     e = 1.2;
        // }
// }
// class Try extends MathConstants{

// }
// --------------Error-----------------------
class MathConstants{
    final double PI = 3.14;
    final double e = 2.73;
    
}
public class Finalkw {
   public static void main(String[] args) {
        MathConstants m = new MathConstants();
        System.out.println("PI  : " + m.PI);
        System.out.println("e : " + m.e);
   } 
}

/*
Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

 */