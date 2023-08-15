package collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Linked list is faster than arraylist as no bit is shift if we insert or delete any element,
 * just its node gets attached to next node.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list);

//        System.out.println(list.poll());
//        System.out.println(list.pollFirst());
//        System.out.println(list.pollLast());
//        System.out.println(list.peek());
//        System.out.println(list.peekFirst());
//        System.out.println(list.peekLast());
//        System.out.println(list.pop());



//        list.add(3,35);
//        list.addFirst(5);
//        list.addLast(45);

//        Iterator<Integer> iterator= list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        System.out.println(list);
    }
}
