import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetJ {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(4);
        set.add(30);
        set.add(20);
        set.add(15);
        set.add(35);

        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(4));
        System.out.println(set.toArray()[3]);
        // set.clear();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + "  ");
        }
        System.out.println();
        Spliterator<Integer> s = set.spliterator();
        s.forEachRemaining(System.out::print);
    }
}

/*
1. add() - add element to the HashSet
2. clear() - remove all elements from the HashSet
3. clone() - return a shallow copy of the HashSet
4. contains() - return true if the HashSet contains the specified element
5. isEmpty() - return true if the HashSet is empty
6. remove() - remove the specified element from the HashSet
7. size() - return the number of elements in the HashSet
8. spliterator() - return a Spliterator over the elements in the HashSet

 */