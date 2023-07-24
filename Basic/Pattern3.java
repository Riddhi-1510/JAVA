import java.util.Scanner;
 
public class Pattern3 {
    public int factorial(int x){
        if(x==0){
            return 1;
        }
        return x * factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(),i,j;
        Pattern3 g = new Pattern3();
        for(i=0;i<=x;i++){
            for(j=0;j<=x-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" "+g.factorial(i)/((g.factorial(i-j)*g.factorial(j))));
            }
            
            System.out.println();
        }
   
    }

}
/*
 
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1                      



 */