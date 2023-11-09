// import java.io.*;
import java.util.Scanner;

import javafx.beans.binding.FloatExpression;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileHandling {
    public static void main(String[] args) {
        try{
            // writeFile();
            readFile();
            // appendFile();
            // deleteFile();
            getLength();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void writeFile() throws IOException{
        FileWriter file = new FileWriter("file.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The String... :>>>");
        String str = scan.nextLine();

        file.write(str);
        file.close();
    }

    public static void readFile() throws IOException{
        FileReader file = new FileReader("file.txt");
        int i;
        while((i=file.read())!=-1){
            System.out.print((char)i);
        }
        file.close();

    }

    public static void appendFile() throws IOException{
        FileWriter file = new FileWriter("file.txt",true);
        file.write("Hey Riddhi This Text is APPEND Text ohhhh....");
        file.close();
    }

    public static void deleteFile() throws IOException{
        // FileWriter file = new FileWriter("file.txt");
        // file.write("");
        // file.close();

        Path p = Paths.get("file.txt");
        Files.delete(p);
        System.out.println("Delete file successfully");

    }

    public static void getLength() throws IOException{
        FileReader file = new FileReader("file.txt");
        int i,cnt=0;
        while((i=file.read())!=-1){
            cnt++;
        }
        System.out.println("File Text Length is : " + cnt);
    }
}
