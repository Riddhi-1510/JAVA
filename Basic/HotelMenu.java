import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        int choice, choice2, choice3, amt = 0,item;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1-------Gujarati");
            System.out.println("2-------Punjabi");
            System.out.println("3-------Exit");
            System.out.println("Enter Your choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("1----Sweet");
                        System.out.println("2----Farsan");
                        System.out.println("3----Sabji");
                        System.out.println("4----Roti");
                        System.out.println("Enter Your choice : ");
                        choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                    System.out.println("1-----Apple Sharikhand");
                                    System.out.println("2-----Puran Puri");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (120)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (200)*item;
                                                break;
                                       
                                    }// end choice3
                                
                            break;
                            case 2:
                                    System.out.println("1-----ALoo Tikki");
                                    System.out.println("2-----PaniPuri");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (100)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (90)*item;
                                                break;
                                       
                                    }// end choice3
                               
                            break;
                            case 3:
                                    System.out.println("1-----Ringna Masala");
                                    System.out.println("2-----Moong Lachko");
                                    System.out.println("3-----Aloo Capsicum");
                                    System.out.println("4-----Dal/Kadhi");
                                    System.out.println("5-----Steam Rice");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (120)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (200)*item;
                                                break;
                                        case 3:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (220)*item;
                                                break;
                                        case 4:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (150)*item;
                                                break;
                                        case 5:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (190)*item;
                                                break;
                                    }// end choice3
                                
                            break;
                            case 4 : System.out.println("1-----Roti without Ghee");
                                     System.out.println("2-----Roti with Ghee");
                                     System.out.println("3-----debla");
                                     System.out.println("4----Puri");
                                     System.out.println("Enter Your choice : ");
                                     choice3 = scan.nextInt();
                                     switch(choice3){
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (7)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (10)*item;
                                                break;
                                        case 3:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (15)*item;
                                                break;
                                        case 4:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (8)*item;
                                                break;
                                     }
                            break;
                        }// end choice2

                    
                break;
                case 2:
                        System.out.println("1----Soup");
                        System.out.println("2----Starters");
                        System.out.println("3----Main Course");
                        System.out.println("4----Roti");
                        System.out.println("Enter Your choice : ");
                        choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                    System.out.println("1-----Sweet corn");
                                    System.out.println("2-----Hot and Sour veg");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (200)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (180)*item;
                                                break;
                                        
                                    }// end choice3
                                
                            break;
                            case 2:
                                    System.out.println("1-----Manchurian");
                                    System.out.println("2-----Noodels");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (200)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (230)*item;
                                                break;
                                        
                                    }// end choice3
                                
                            break;
                            case 3:
                                    System.out.println("1-----Dal Tadke");
                                    System.out.println("2-----Dal Fry");
                                    System.out.println("3-----Jeera Aloo");
                                    System.out.println("4-----Aloo Palak");
                                    System.out.println("5-----Kaju Kari");
                                    System.out.println("6-----Cheese paneer Masala");
                                    System.out.println("7-----Cheese paneer Corn");
                                    System.out.println("Enter Your choice : ");
                                    choice3 = scan.nextInt();
                                    switch (choice3) {
                                        case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (220)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (240)*item;
                                                break;
                                        case 3:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (220)*item;
                                                break;
                                        case 4:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (190)*item;
                                                break;
                                        case 5:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (150)*item;
                                                break;
                                        case 6:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (290)*item;
                                                break;
                                        case 7:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (300)*item;
                                                break;
                                        
                                    }// end choice3
                               
                            break;
                            case 4 :System.out.println("1-----Roti/Puri");
                                    System.out.println("2-----Tandoori Roti");
                                    System.out.println("3-----Chapati");
                                    System.out.println("4-----Naan");
                                    System.out.println("5-----Cheese Naan");
                                    System.out.println("6------Lachaa Paratha");
                                    System.out.println("Enter Your Choice : ");
                                    choice3 = scan.nextInt();
                                    switch(choice3){
                                       case 1:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (10)*item;
                                                break;
                                        case 2:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (20)*item;
                                                break;
                                        case 3:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (25)*item;
                                                break;
                                        case 4:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (25)*item;
                                                break;
                                        case 5:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (30)*item;
                                                break;
                                        case 6:System.out.println("Enter item : ");
                                                item = scan.nextInt();
                                                amt += (30)*item;
                                                break;
                                    }

                            break;
                        }// end choice2
                break;
                case 3:System.exit(0);
                       break;


            }//end choice
            
        System.out.println("amt is : " + amt);

        }//end while

    }
}
