public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sBuilder = new StringBuffer();
        sBuilder.append("The quick brown fox jumps over the lazy dog.");
        String s="";
        for(int i=0;i<26;i++){
            s +=(char)(97 + i);
        }
        for(int i=0;i<26;i++){
            for(int j=sBuilder.length()-1;j>=0;j--){
                if(s.charAt(i)==sBuilder.charAt(j)){
                    System.out.println(s.charAt(i) + " " + j);
                    break;
                }
            }
        }
    }
}
/*
2. Write a Java program to get the last index of a string within a string.

Sample Output:

 a  b c  d  e  f  g  h i  j                                                                                   
===========================                                                                                   
36 10 7 40 33 16 42 32 6 20                                                                                   
                                                                                                              
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 41 23 4 29 24 31                                                                                   
                                                                                                              
 u  v  w  x  y  z                                                                                             
=================                                                                                             
21 27 13 18 38 37
Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
 */
