package collection.queue;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListWithQueueInterface {
    public static void main(String[] args){
        Queue<Integer> q1=new LinkedList<>();

        // Throws exceptions
        q1.add(9); // bydefault will add at last
        q1.add(3);
        q1.remove(); // bydefault will remove first

        q1.offer(8); // bydefault will add at last
        q1.offer(6);
        q1.peek();
        q1.poll(); // bydefault will remove first
    }
}
