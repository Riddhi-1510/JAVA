import java.util.Scanner;

public class Data11 {

    public static void main(String[] args) {

        // object
        try (Scanner scan = new Scanner(System.in)) {

            String s = scan.nextLine();
            int i;
            for (i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int x = (int) ch;
                System.out.println(ch + " : " + x);
            }
        }
    }
}
