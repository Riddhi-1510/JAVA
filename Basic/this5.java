import java.util.Arrays;

public class this5 {
 

    void frequencyCounter(String s){
        int cnt=0,j=0;
        String str[] = new String[100];
        String ans = "";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                str[j] = ans;
                ans = "";
                j++;
                cnt++;
            }else{
                ans = ans + s.charAt(i);
            }
        }
        if (!ans.isEmpty()) {
            str[j] = ans;
            cnt++;
        }
        System.out.println("Frequency of word is : " + cnt);
        cnt = 0;
        Arrays.sort(str, 0, j + 1);  
        int maxi = 0;
        // for(int i=0;i<j+1;i++){
        //     System.out.println(str[i]);
        // }
        for(int m = 1;m<=j;m++){
            if(str[m-1].equals(str[m])){
                cnt++;
                // System.out.println(str[m-1] + "  " + str[m]);
                maxi = Math.max(maxi,cnt);
                if(maxi == cnt){
                     ans = str[m];
                }
            }else{
                cnt = 0;
                  
            }
        }

        System.out.println("Word is : " + (ans) + " and most frequency is : " + (maxi+1));
            


    }

   
    public static void main(String[] args) {
        this5 obj = new this5();
        obj.frequencyCounter("hello hello riddhi hello riddhi mistry riddhi riddhi");
    }
}

/*
7. **Word Frequency Counter:** Write a Java program that reads a text file, counts the frequency of each word, and displays the top N most frequent words.
 */