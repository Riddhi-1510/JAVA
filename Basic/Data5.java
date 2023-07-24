import java.util.Scanner;

public class Data5 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            String s = scan.next().toLowerCase();
            
            boolean vowels = s.equals("a")|| s.equals("e") || s.equals("i")||s.equals("o")||s.equals("u");

            if(vowels){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }
}

// 8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

// Test Data
// Input an alphabet: p
// Expected Output :
// Input letter is Consonant
