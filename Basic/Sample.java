import java.util.*;

class Sample{
	
	public static void main(String args[]){

		while(true){
			Scanner scan = new Scanner(System.in);
			int a,b,choice,ans;
			System.out.println("1----For Addition");
			System.out.println("2----For subtraction");
			System.out.println("3----For multiplication");
			System.out.println("4----For division");
			System.out.println("5----For exit");
	
			System.out.print("Enter a : ");
			a = scan.nextInt();
			System.out.print("Enter b : ");
			b = scan.nextInt();
			
			System.out.print("Enter Your CHoice : ");
			choice = scan.nextInt();

			switch(choice){
				case 1 :  ans = a+b;
					  System.out.println("Sum is : " + ans);
					  break;
				
				case 2 :  ans = a-b;
					  System.out.println("Sub is : " + ans);
					  break;


				case 3 :  ans = a*b;
					  System.out.println("Mul is : " + ans);
					  break;

				case 4 :  ans = a/b;
					  System.out.println("Div is : " + ans);
					  break;
				case 5 :  System.exit(0);
					  break;
			}//end switch
		}//end while
		
	}//end main class
}//end class
