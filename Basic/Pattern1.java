import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(),i,j,k;
       
        for(i=1;i<=x;i++){
            for(j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            for(j=i-1;j>=1;j--){
     			System.out.print((char)(j+64));
			} 
            
            System.out.println();
        }


        for(i=x;i>=1;i--){
            for(j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            for(j=i-1;j>=1;j--){
     			System.out.print((char)(j+64));
			} 
            
            System.out.println();
        }
    }   
}

/*
 

      A                                                  
     ABA                                                 
    ABCBA                                                
   ABCDCBA                                               
  ABCDEDCBA                                              
 ABCDEFEDCBA  

ABCDEFGFEDCBA                                            
 ABCDEFEDCBA                                             
  ABCDEDCBA                                              
   ABCDCBA                                               
    ABCBA                                                
     ABA                                                 
      A  


 */