import java.util.Scanner;

public class This3 {
    void primeN(int a){
        int flag = 0;
        for(int i=2;i<=a;i++){
            flag = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i + "  ");
            }
        }
    }
    public static void main(String[] args) {
        //obj
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //obj class
        This3 obj = new This3();
        obj.primeN(a);

    }
}

/*
2. **Prime Number Generator:** Develop a Java program that generates and prints all prime numbers within a given range.
 */