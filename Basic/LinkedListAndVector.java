import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;

public class LinkedListAndVector {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(70);
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(50);
        list.add(40);

        System.out.println(list);

        list.clear();
        System.out.println(list);

        //VVVVectorVVVV
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(70);
        v.add(20);
        v.add(60);
        v.add(30);
        v.add(50);
        v.add(40);

        System.out.println(v);

        Iterator<Integer> i = v.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + "  ");
        }
        System.out.println();

        v.set(4,100);
        System.out.println(v);
    }
}
