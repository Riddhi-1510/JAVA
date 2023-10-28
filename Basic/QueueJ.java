import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class QueueJ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(12);
        pq.add(72);
        pq.add(22);
        pq.add(62);
        pq.add(32);
        pq.add(52);
        pq.add(42);

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(42));
        System.out.println(pq.toArray()[3]);
        pq.clear();
        System.out.println(pq);


        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // deque.add(10);
        // deque.add(70);
        // deque.add(20);
        // deque.add(60);
        // deque.add(30);
        // deque.add(50);
        // deque.add(40);

        
        deque.offerFirst(10);
        deque.offerLast(15);
        deque.offer(30);
        deque.offerFirst(20);
        deque.offerFirst(10);
        deque.offerLast(15);
        deque.offer(30);
        deque.offerFirst(20);
        System.out.println(deque);
/*> offer returns true if the element is added successfully and false if the element is not added
        > add throws an exception if the element is not added*/

        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);

        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
        System.out.println(deque.contains(10));
        System.out.println(deque.toArray()[2]);

        System.out.println(deque.removeFirstOccurrence(10));
        System.out.println(deque.removeLastOccurrence(20));
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        Iterator<Integer> i = deque.iterator();
        while(i.hasNext()){
            System.out.print(i.next()  + "   ");
        }
        System.out.println();

        Spliterator<Integer> s = deque.spliterator();
        s.forEachRemaining(System.out::println);
        //element->system.out.print(element+" , ");

        //TryAdvance : Spliterator
        while(s.tryAdvance(n->System.out.println(n))){}


        Comparator<Integer> reverse = new Comparator<Integer>() {      
            @Override
            public int compare(Integer a,Integer b){
                return b.compareTo(a);
            }
        };

        deque.stream().sorted(reverse).forEach(System.out::println);
    }

}

/*
Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue
    3. peek() - return the element at the front of the Queue
    4. poll() - return the element at the front of the Queue and remove it
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue
    8. spliterator() - return a Spliterator over the elements in the Queue
Methods of Deque: (Double Ended Queue)
    1. addFirst() - add element to the front of the Deque
    2. addLast() - add element to the end of the Deque
    3. removeFirst() - remove element from the front of the Deque
    4. removeLast() - remove element from the end of the Deque
    5. peekFirst() - return the element at the front of the Deque
    6. peekLast() - return the element at the end of the Deque
    7. pollFirst() - return the element at the front of the Deque and remove it
    8. pollLast() - return the element at the end of the Deque and remove it
    9. size() - return the number of elements in the Deque
    10. isEmpty() - return true if the Deque is empty
    11. clear() - remove all elements from the Deque

 */