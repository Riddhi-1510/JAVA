import java.util.*;

public class Task3Class {
        public static void main(String[] args) {
            this5 obj = new this5();
            //create scanner obj;
            Scanner scan = new Scanner(System.in);
            String s;
            System.out.println("Enter String : ");
            s = scan.nextLine();
            String str4[] = s.split(" ");
            int freq[] = new int[str4.length];
            Arrays.sort(str4);
            int cnt = 0;
            int x = 0;
            for(int i=1;i<str4.length;i++){
                // System.out.println(str4[i-1] + "   " + str4[i]);
                if(str4[i-1].equals(str4[i])){
                    cnt++;
                }else{
                    cnt++;
                    System.out.println(str4[i-1] + "  " + cnt);
                    cnt = 0;
                }
            }
            if(cnt!=0){
                System.out.println(str4[str4.length-1]  + " " + (cnt+1));
            }
            

        }
}

