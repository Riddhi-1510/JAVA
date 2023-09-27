public class StrBuff2 {
    void createPermutation(String mains,String temp){
        if(mains.length() == temp.length()){
            System.out.println(temp);
            return;
        }
        for(int i=0;i<mains.length();i++){
            createPermutation(mains, temp+mains.charAt(i));
        }
    }
    public static void main(String[] args) {
        StrBuff2 s = new StrBuff2();
        s.createPermutation("PQR","");
    }
}

/*
4. Write a Java program to print all permutations of a given string with repetition.
The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
...
RRP
RRQ
RRR
 */