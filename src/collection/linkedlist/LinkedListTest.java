package collection.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args){

        // LinkedList<String> ll1=new LinkedList<>(Arrays.asList("a","b","c","d")); // will only give List methods not LinkedList as ref is List

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("a","b","c","d"));
        /* Size */
        // size
        ll1.size(); // O(1) -> size is stored as property

        // check if empty
        ll1.isEmpty();

        /* ADDITION */

        // add
        ll1.add("g"); // adds at last // O(1) as doubly linked list we have tail pointer

        List<String> extras=new ArrayList<>(Arrays.asList("k","y","c"));
        // adding multiple elements
        ll1.addAll(extras); // O(extras.size())

        // add at the start O(1)
        ll1.addFirst("p"); // O(1)

        // add at last
        ll1.addLast("z"); // O(1) as it's a doubly linkedList we have tail too

        /* Set */
        ll1.set(2,"x"); // O(N) -> as we need to traverse the indexes from start

        /* Remove a node */
        ll1.remove(); // removes last by default // O(N) -> need to traverse

        // remove by index
        ll1.remove(3); //  o(N) -> need to traverse

        // remove by Reference
        ll1.remove("g"); // does find and remove // O(n) -> need to traverse

        // bulk remove
        ll1.removeAll(extras);

        // remove first and last i.e. head and tail
        ll1.removeFirst();
        ll1.removeLast();

        // traverses and removes the first occurrence
        ll1.removeFirstOccurrence("p");
        ll1.removeLastOccurrence("k");

        // conditional removing
        ll1.removeIf(s->s.equals("x"));

        // clear all elements
        ll1.clear();

        /* Existence */
        ll1.contains("p");

        /* Accessing element by index, index of */

        // Get by index
        ll1.get(3); // o(N) -> need to search

        // get first and last
        ll1.getFirst();
        ll1.getLast();

        // get index of an element
        ll1.indexOf("g");

        /* Equality */
        LinkedList<String> ll2=new LinkedList<>(ll1);
        boolean eq1=ll1.equals(ll2);

        /* Sorting */
        ll1.sort(null);

        /* Clone */ // returns an Object
        Object ll3 = ll1.clone();

        /* Just prints the elemensts inside */
        System.out.println(ll3.toString());

        /* get head */
        String head=ll1.getFirst();
        String tail=ll1.getLast();

        /* Traversing */
        // Using Iterator
        Iterator<String> it=ll1.iterator();
        while(it.hasNext()){
            // String value=it.next();
            // System.out.println(value);
            System.out.println(it.next());
        }

    }
}
