public class StrBuff3 {
    void permutations(String s,int l,int r){
        if(l==r){
            
        }
    }
    public static void main(String[] args) {

        StrBuff3 s = new StrBuff3();
        String str = "ABCD";
       
        s.permutations(str,0,str.length()-1);
    }
}

/*
 5. Write a Java program to find the lexicographic rank of a given string.
 The Given String is: BDCA
The Lexicographic rank of the given string is: 12
N.B.: Total possible permutations of BDCA are(lexicographic order) :
ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA
1   2   3   4   5   6   7   8   9   10   11   12
  The BDCA appear in 12 position of permutation (lexicographic order).  
 */