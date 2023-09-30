public class LongestPalindromicSub {
    public static void main(String[] args) {
        String s = "thebrownfoxxofnworbqrtm";
        String ans="";
        int maxLength=0;
        int dp[][] = new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                dp[i][j]=0;
            }
        }
        
        for(int diff=0;diff<s.length();diff++){
            for(int i=0,j=i+diff;j<s.length();i++,j++){
               
                    if(i==j){
                        dp[i][j] = 1;
                    }
                    else if(diff==1){
                        if(s.charAt(i)==s.charAt(j)){
                            dp[i][j] = 2;
                        }
                    }else{
                        if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]!=0){
                            dp[i][j] = dp[i+1][j-1]+2;
                        }
                    }

                    if(dp[i][j]!=0){
                        if(maxLength<j-i+1){
                            maxLength = j-i+1;
                            ans = s.substring(i, j+1);
                        }
                    }

            }
            
        }

        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<s.length();j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        
        System.out.println("longest Palindromic Substring is : " + ans);
        System.out.println("max length is  : " + maxLength);
    }   
}

/*
3. Write a Java program to find the longest Palindromic Substring within a string.
Sample Output:
The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb
The length of the palindromic substring is: 16
 */