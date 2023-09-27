public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer();
        sbuff.append("HEllo Java");
        System.out.println("Sbuff is : " + sbuff);
        System.out.println("Sbuff length : " + sbuff.length());
        System.out.println("Sbuff.capacity : " + sbuff.capacity());

        sbuff.setLength(20);
        System.out.println("Sbuff.length : " + sbuff.length());
        System.out.println("sbuff.capacity : " + sbuff.capacity());
        //newCapacity : oldCapacity*2 + 2 :-> 16*2 + 2 :-> 34
    }
}

/*
StringBuffer:
    > StringBuffer is a mutable sequence of characters.
    > StringBuffer is a class in java.lang package.
    > StringBuffer is used to create mutable (changeable) string.
    > StringBuffer is thread safe.
    > StringBuffer is slower than StringBuilder because it is thread safe.
    > StringBuffer is used when we want to make a lot of modifications to a string of characters.
Methods:
same as StringBuilder class.
*/