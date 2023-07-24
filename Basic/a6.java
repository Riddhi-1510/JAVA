import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        
        //obj
        
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of the Array : ");
        size = scan.nextInt();
        String str[] = new String[size];
        boolean bool[] = new boolean[size] ;
        for(int i=0;i<size;i++){
            str[i] = scan.next();
            int flag = 0;
            int len = str[i].length();
            String s = str[i];
            for(int j=0;j<len;j++){
                // System.out.println("len is : " + len + " str is : " + str[i]);
                if(s.charAt(j)!=s.charAt(len-j-1)){
                    // System.out.println(s[j] + "  " + s[len-j-1]);
                    flag = 1;
                    break;
                }
            }
            if(flag==1){
                bool[i] = false;
            }else{
                bool[i] = true;
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(bool[i] + " ");
        }
        
    }
}

/*
> Array -> array of palindrome strings -> check if palindrome or not
ex: ["mom", "dad", "racecar", "bat"] -> [true, true, true, false]\
 */