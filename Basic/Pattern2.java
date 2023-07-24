 import java.util.Scanner;

public class Pattern2 {
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(),i,j;
        for(i=1;i<=x;i++){
            for(j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
     			System.out.print(j);
			} 
            
            System.out.println();
        }


        for(i=x;i>=1;i--){
            for(j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
     			System.out.print(j);
			} 
            
            System.out.println();
        }


     
}

/*
 
      1                                                  
     212                                                 
    32123                                                
   4321234                                               
  543212345                                              
 65432123456                                             
7654321234567 

 65432123456                                             
  543212345                                              
   4321234                                               
    32123                                                
     212                                                 
      1  

 */
}
