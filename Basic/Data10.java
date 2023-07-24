import java.util.Scanner;

public class Data10 {
    public static void main(String[] args) {
        //obj
        Scanner scan = new Scanner(System.in);

        char ch = scan.next().charAt(0);
       
        int x;
        
        x = (ch!='a'&& ch!='e'&&ch!='i' && ch!='o' && ch!='u') ? 1 : 0;
        switch(x){
            case 1 : System.out.println("Consonant");
            break;
            case 0 : System.out.println("Vowel");
            break;
        }
    }   
}

/*
Create a program that prompts the user to enter a character and displays whether it is a vowel or a consonant using switch case.
 */