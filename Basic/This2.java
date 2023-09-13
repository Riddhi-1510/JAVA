public class This2 {
    void palindrome(String s){
        int flag = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("NOOOO....");
        }else{
            System.out.println("Yessss....");
        }
    }
    
   
    public static void main(String[] args) {
        //create obj
        This2 obj = new This2();
        obj.palindrome("madam");
    }
}
/*
 * 1. **Palindrome Checker:** Write a Java program to determine if a given string is a palindrome or not.

 */