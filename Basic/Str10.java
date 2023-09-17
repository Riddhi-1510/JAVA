import java.util.Scanner;
public class Str10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String  : ");
        String s = scan.nextLine();
            if(s.charAt(0)>=97 && s.charAt(0)<=122){
                int x =  s.charAt(0);
                x = x - 32;
                char c = (char)x;
                System.out.print(c);
            }else{
                System.out.print(s.charAt(0));    
            }
            
        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i) == ' '){
                if(s.charAt(i+1)>=97 && s.charAt(i+1)<=122){
                   int x =  s.charAt(i+1);
                    x = x - 32;
                    char c = (char)x;
                    System.out.print(" " + c);
                    i++;
                }
            }else{
                System.out.print(s.charAt(i));
            }

        } 
    }
}

/*
10. Sentence Capitalization: Create a function that capitalizes the first letter of each word in a sentence without using any string methods.
 */