import java.util.Scanner;

public class StrTextAnalyzer {
    int len(String text){
        int c = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                c++;
            }
        }
        return c;
    }
    int cntChar(String text){
        int cnt = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                continue;
            }else{
                cnt++;
            }
        }
        return cnt-1;
    }

    int wordCntAndSplit(String text){
        int cnt = 1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println("Total number of word is : " + (cnt-1));

        for(String s : text.split(" ")){
            System.out.println("--> " + s);
        }
        return cnt-1;
    }

    void replace(String oldchar,String newchar,String text){
          
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == oldchar.charAt(0)){
               System.out.print(newchar);
            }else{
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();

    }

    void substring(int beginIndex,int endIndex,String text){
        for(int i=beginIndex;i<endIndex;i++){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    void join(String delimiter, String text){
        StrTextAnalyzer sta = new StrTextAnalyzer();
        int x = sta.len(text)+1;
        String arr[] = new String[x+1];
        int i=0;
        System.out.println("x is : " + x);
        for(String s : text.split(" ")){
            arr[i] = s;
            i++;
        }
        for(int j=0;j<i;j++){
            System.out.println(arr[j]);
        }
        String joinStr = "";
        for(int j=0;j<i-1;j++){
            joinStr = joinStr + arr[j] + delimiter ;
        }
        joinStr = joinStr + arr[x-1];
        System.out.println(joinStr);

    }
    public static void main(String[] args) {
            StrTextAnalyzer sta = new StrTextAnalyzer();

            Scanner scan = new Scanner(System.in);

            System.out.println("1----Enter Multi-sentence paragraph as input : ");
            String text = scan.nextLine();  

            int totalC = sta.cntChar(text);
            System.out.println("2----Total char is : " + totalC);

            System.out.println("3---word cnt and split : ");
            sta.wordCntAndSplit(text);    

            System.out.println("4---Enter old-char and new-char : ");
            String oldchar = scan.next();
            String newchar = scan.next();
            sta.replace(oldchar,newchar,text); 

            System.out.println("5----Enter beginIndex end endIndex : ");
            int beginIndex = scan.nextInt();
            int endIndex = scan.nextInt();
            sta.substring(beginIndex, endIndex,text);

            String lower = text.toLowerCase();
            System.out.println("6----to convert to lower case : " + lower);

            System.out.println("7---Enter word for find index : ");
            String word = scan.next();
            int index = text.indexOf(word);
            System.out.println("Index is : " + index);
            
            System.out.println("8---remove space both side right and left : ");
            String strim = text.trim();
            System.out.println("After use trime function : " + strim);

            System.out.println("9----Text join Enter delimiter : ");
            String delimiter = scan.next();
            sta.join(delimiter,text);

            System.out.println("10----text is empty or not : ");
            if(text.isEmpty()){
                System.out.println("Text is Empty...");
            }else{
                System.out.println("Text is not Empty...");
            }

            System.out.println("11----Compare without case , Scan the new Text :  ");
            scan.nextLine();
            String newText =  scan.nextLine();
            if(text.equalsIgnoreCase(newText)){
                System.out.println("Both text are same : >");
            }else{
                System.out.println("Both text are not same : <");
            }

            System.out.println("12----Display the interned text : " + text.intern());
    }
}

/*
Problem: Text Analyzer

You are tasked with creating a text analyzer program that takes a paragraph as input and performs various operations using the provided methods. The program should be able to process the paragraph and provide insightful information about it. Your task is to implement this text analyzer.

Here are the requirements:

1. Input Paragraph: Accept a multi-sentence paragraph as input from the user.

2. Character Analysis:
   - Implement a function that calculates and displays the number of characters (excluding spaces) in the paragraph using the 'length()' method.

3. Word Extraction:
   - Implement a function that extracts individual words from the paragraph. Split the paragraph into words using the 'split(String regex)' method with space as the delimiter.
   - Calculate and display the total number of words in the paragraph.

4. Search and Replace:
   - Implement a function that prompts the user to input a character to be replaced and a character to replace it with.
   - Use the 'replace(char oldChar, char newChar)' method to replace all occurrences of the specified character in the paragraph.
   - Display the modified paragraph after replacement.

5. Substring Analysis:
   - Implement a function that prompts the user to input a starting index and an ending index for substring extraction.
   - Extract and display the substring using the 'substring(int beginIndex, int endIndex)' method.

6. Case Conversion:
   - Implement a function that converts the entire paragraph to lowercase using the 'toLowerCase()' method and displays the result.

7. Search and Indexing:
   - Implement a function that prompts the user to input a word to search for in the paragraph.
   - Use the 'indexOf(String str)' method to find the first occurrence of the input word and display its index.
   - If the word is not found, display a message indicating that.

8. Trimming:
   - Implement a function that removes any leading and trailing spaces from the paragraph using the 'trim()' method.
   - Display the trimmed paragraph.

9. Text Joining:
   - Implement a function that joins the words extracted earlier into a new paragraph using the 'join(CharSequence delimiter, CharSequence... elements)' method.
   - Prompt the user to input a delimiter to be used for joining.

10. Empty Check:
    - Implement a function that checks whether the paragraph is empty (contains no characters) using the 'isEmpty()' method.
    - Display the result.

11. Case Insensitive Comparison:
    - Implement a function that prompts the user to input another paragraph.
    - Use the 'equalsIgnoreCase(String anotherString)' method to compare the two paragraphs without considering case.
    - Display whether the two paragraphs are equal or not.

12. Interning Strings:
    - Implement a function that interns the current paragraph using the 'intern()' method.
    - Display the interned paragraph.

Your task is to design and implement the text analyzer program that fulfills these requirements. Use the provided methods to perform the necessary operations on the input paragraph.

---

Sample Input Paragraph:
The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away.

1. Character Analysis:
   - Input: (No user input needed)
   - Output: Number of characters (excluding spaces): 64

2. Word Extraction:
   - Input: (No user input needed)
   - Output: Total number of words: 16

3. Search and Replace:
   - Input: Replace 'o' with 'X'
   - Output: Modified paragraph: "The quick brXwn fXx jumps Xver the lazy dXg. The dXg barks and the fXx runs away."

4. Substring Analysis:
   - Input: Starting index: 10, Ending index: 24
   - Output: Substring: "brown fox jumps"

5. Case Conversion:
   - Input: (No user input needed)
   - Output: Lowercase paragraph: "the quick brown fox jumps over the lazy dog. the dog barks and the fox runs away."

6. Search and Indexing:
   - Input: Search for word: "dog"
   - Output: Index of "dog": 40

7. Trimming:
   - Input: (No user input needed)
   - Output: Trimmed paragraph: "The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away."

8. Text Joining:
   - Input: Delimiter: " | "
   - Output: Joined paragraph: "The | quick | brown | fox | jumps | over | the | lazy | dog. | The | dog | barks | and | the | fox | runs | away."

9. Empty Check:
   - Input: (No user input needed)
   - Output: The paragraph is not empty.

10. Case Insensitive Comparison:
    - Input: Enter another paragraph: "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. THE DOG BARKS AND THE FOX RUNS AWAY."
    - Output: The two paragraphs are equal (case-insensitive).

11. Interning Strings:
    - Input: (No user input needed)
    - Output: Interned paragraph: "The quick brown fox jumps over the lazy dog. The dog barks and the fox runs away."


 */