public class Strings {
    public static void main(String[] args) {
        String str= "Hello world!";
        // System.out.println("Str is : " + str);
        // System.out.println("str.hashcode() : " + str.hashCode());
        // str = "Goodby world";
        // System.out.println("after replce content hashcode is : " + str.hashCode());
        // //both are difference

        //charAt(0);
        System.out.println("Str.charAt(0) : " + str.charAt(0));

        //compareTo();--give diff between ascii numbers
        System.out.println("str.compareTo(\"Hello world!\") : "+ str.compareTo("Hello world!") );

        //concat();
        System.out.println("str.concat(\" Hey Riddhi!!\") : "+str.concat(" Hey Riddhi!!"));

        //contains();--return true or false
        System.out.println("Concatins is check this word present or not : " + str.contains("Hello"));

        //endsWith()--return true or false
        System.out.println("check this end with this or not : " + str.endsWith("!4"));

        //equals();
        System.out.println("check both string are same or not if same then return true else false : " + str.equals("Hello world!"));

        //equalsIgnoreCase();
        System.out.println("check without diff case : " + str.equalsIgnoreCase("hello world!"));

        //format():
        System.out.println("return a formatted string : " + String.format(" string is : %s",str));

        //getBytes();
        System.out.println("Encode the sequence of bytes using the platform");
        for(byte b : str.getBytes()){
            System.out.print(b + " ");
        }
        System.out.println();
        for(byte b : str.getBytes()){
            System.out.print((char)b + " ");
        }System.out.println();

        //getChars() 
        System.out.println("store all character in one array");
        char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);
        for(char c:charArray){
            System.out.print(c+" ");
        }System.out.println();

        //indexOf : 
        System.out.println("return index of perticular character : " + str.indexOf("!"));

        //intern();
        System.out.println("return a cononical representation for the string object : " + str.intern());

        //isEmpty():
        System.out.println("If string is empty then return false means string len is 0 : " + str.isEmpty());

        //join():
        System.out.println("we give arg words and this function concat all : "+String.join("_","riddhi","mistry"));

        //lastIndexOf();
        System.out.println("return the index within this string of the last occurrence of the specified character character of -1 if not found" + str.lastIndexOf("l"));

        //replace();
        System.out.println("replace the word : " + str.replace("Hello", "Good night"));

        //split();
        System.out.println("Split function one string divided to multiple words : ");
        for(String s : str.split(" ")){
            System.out.println(s);
        }

        //startsWith();
        System.out.println("check start with this or not : " + str.startsWith("hello"));

        //substring();
        System.out.println("part of string give : "+str.substring(4,8));

        //toLowerCase();
        System.out.println("Conver to string lower case : " + str.toLowerCase());

        //toUpperCase();
        System.out.println("conver to Uppercase : " + str.toUpperCase());

        //trim();
        System.out.println("Remover both left and right side : " + "  abcd  ".trim());

        //valueOf();
        System.out.println("Conver to string passed the argument : " + String.valueOf(123));
    }   

}
