public class SBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Hello");
        String s = "HEllo Java";
        // StringBuilder sb = new StringBuilder(s);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println("Sb.length : " + sb.length());
        System.out.println("Sb.capacity : " + sb.capacity());
        System.out.println("sb.charAt(0) : " + sb.charAt(0));
        System.out.println("Sb.deleteCharAt(0) : " + sb.deleteCharAt(0));
        System.out.println(sb);
        System.out.println("Sb.delete(0,4) : " + sb.delete(0, 4));
        sb.ensureCapacity(70);
        //new_capacity : old_capacity*2 + 2;
        System.out.println("Sb.capacity : " + sb.capacity());
        sb.setLength(30);
        System.out.println("sb.length() : " + sb.length());
        System.out.println(sb);
    }
}

/*
Ex : panipuri...
Whenever we want to make a string mutable (changeable), we use StringBuilder class.
> StringBuilder is a mutable sequence of characters.
> StringBuilder is a class in java.lang package.
> StringBuilder is used to create mutable (changeable) string.
> StringBuilder is not thread safe.
> StringBuilder is faster than StringBuffer because it is not thread safe.
> StringBuilder is used when we want to make a lot of modifications to a string of characters.
Methods:
here are the methods that is included with stringbuilder class: (excluding the methods that are also included in string class)
1. capacity() : returns the current capacity of the stringbuilder object.
2. delete() : deletes the characters from the specified index to the specified index.
3. deleteCharAt() : deletes the character at the specified index.
4. ensureCapacity() : increases the capacity of the stringbuilder object.
*/ 