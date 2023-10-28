import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetJ {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(70);
        set.add(20);
        set.add(60);
        set.add(30);
        set.add(50);
        set.add(40);

        System.out.println(set);

        // Clone....Copy

        TreeSet<Integer> cloneSet = (TreeSet<Integer>) set.clone();
        System.out.println(cloneSet);

        // first
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(1000));
        System.out.println(set);
        System.out.println(set.tailSet(1));
        System.out.println(set);
        System.out.println(set.subSet(20, 40));

        System.out.println(set.higher(40));
        System.out.println(set.lower(40));

        // Print reverse.....
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        TreeSet<Integer> set2 = new TreeSet<>(comp);
        set2.addAll(set);
        System.out.println(set2);
    }
}

/*
 * Methods of TreeSet:
 * 1. boolean add(Object o): This method adds the specified element to this set
 * if it is not already present.
 * 2. boolean addAll(Collection c): This method adds all of the elements in the
 * specified collection to this set.
 * 3. void clear(): This method removes all of the elements from this set.
 * 4. Object clone(): This method returns a shallow copy of this TreeSet
 * instance.
 * 5. boolean contains(Object o): This method returns true if this set contains
 * the specified element.
 * 6. boolean isEmpty(): This method returns true if this set contains no
 * elements.
 * 7. Iterator iterator(): This method returns an iterator over the elements in
 * this set in ascending order.
 * 8. boolean remove(Object o): This method removes the specified element from
 * this set if it is present.
 * 9. int size(): This method returns the number of elements in this set.
 * 10. Object[] toArray(): This method returns an array containing all of the
 * elements in this set.
 * 11. Comparator comparator(): This method returns the comparator used to order
 * the elements in this set, or null if this set uses the natural ordering of
 * its elements.
 * 12. Object first(): This method returns the first (lowest) element currently
 * in this set.
 * 13. SortedSet headSet(Object toElement): This method returns a view of the
 * portion of this set whose elements are strictly less than toElement.
 * 14. Object last(): This method returns the last (highest) element currently
 * in this set.
 * 15. SortedSet subSet(Object fromElement, Object toElement): This method
 * returns a view of the portion of this set whose elements range from
 * fromElement, inclusive, to toElement, exclusive.
 * 16. SortedSet tailSet(Object fromElement): This method returns a view of the
 * portion of this set whose elements are greater than or equal to fromElement.
 * 
 */