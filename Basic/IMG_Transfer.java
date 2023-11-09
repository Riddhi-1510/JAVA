import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IMG_Transfer {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int cnt=0;
        try{
            in = new FileInputStream("input.jpg");
            out = new FileOutputStream("C:\\Users\\riddh\\OneDrive\\Desktop\\output.jpg");
            int _bytes;
            while((_bytes = in.read()) != -1){
                out.write(_bytes);
                cnt++;
            }
            System.out.println("Byte Transferend : " + cnt);
            System.out.println("Copied " + cnt + " bytes");
        }catch(FileNotFoundException e){
            System.out.println("File is Not Found");
        }catch(IOException e){
            System.out.println("I/O Exception....");
        }

    }
}
