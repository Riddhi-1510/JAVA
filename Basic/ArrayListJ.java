import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayListJ {
    //ArrayList/Vector/LikedList/Stack -> implements List interface extends collection interface extends Iterable interface
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(20);
        list.add(18);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(40);
        list2.add(30);

        list.addAll(list2);

        System.out.println(list);

        //list.get(index)
        System.out.println(list.get(3));

        //list.set(index,newValue)
        list.set(0,100);
        System.out.println(list);

        //list.remove(index)
        list.remove(2);
        System.out.println(list);

        //removeAlll
        list.removeAll(list2);
        System.out.println(list);

        //clear
        // list.clear();
        // System.out.println(list);

        //list.size()
        System.out.println(list.size());

        //list.contains(15)
        System.out.println(list.contains(15));

        //toArray.. print objects...
        Object[] arr = list.toArray();
        for(Object object : arr){
            System.out.println(object);
        }

        // int[] a = new int[list.size()];
        // list.toArray(a);
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        //iterator...
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + "   ");
        }
        System.out.println();
    }
}

/*
Collections in java:
    > Collection is a framework that provides an architecture to store and manipulate the group of objects.
Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.
Some of the commonly used methods of the Collection interface that's also available in the List interface are:
add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

 */