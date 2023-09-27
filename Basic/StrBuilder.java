public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("The quick brown fox jumps over the lazy dog.");
        String s="";
        for(int i=0;i<26;i++){
            s +=(char)(97 + i);
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<sBuilder.length();j++){
                if(s.charAt(i)==sBuilder.charAt(j)){
                    System.out.println(s.charAt(i) + " " + j);
                    break;
                }
            }
        }
    }
}


/*
1. Write a Java program to get the index of all the characters of the alphabet.

Sample Output:

a  b c  d e  f  g h i  j                                                                                     
=========================                                                                                     
36 10 7 40 2 16 42 1 6 20                                                                                     
                                                                                                   
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 12 23 4 11 24 31                                                                                   

u  v  w  x  y  z                                                                                              
================                                                                                              
5 27 13 18 38 37

Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

*/