public class StrBuff6 {
    public static void main(String[] args) {
        String str= "redcapmanwithbluecarbluered";
        String temp1="",temp2="";
        int red=0,blue=0;
        for(int i=0;i<str.length()-2;i++){
            temp1 = str.substring(i, i+3);
            if(temp1.equals("red")){
                red++;
            }
            
        }
        for(int i=0;i<str.length()-3;i++){
            temp2 = str.substring(i, i+4);
            if(temp2.equals("blue")){
                blue++;
            }
            
        }
        if(red==blue){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

/*
Write a Java program to check whether two strings of length 3 and 4 appear the same number of times in a given string.

Sample Output:

The given string is: red cap man with blue car
The appearance of red and blue are same: true
 */