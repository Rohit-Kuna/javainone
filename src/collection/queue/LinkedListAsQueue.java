package collection.queue;

import java.util.LinkedList;

public class LinkedListAsQueue {
    public static void main(String[] args){
        LinkedList<Integer> q1=new LinkedList<>();
        // Queue is FIFO
        // enqueue -> q.addLast(ele)
        // dequeue -> q.removeFirst()
        // peekFirst -> q.getFirst()

        q1.addLast(7);
        q1.removeFirst();
        q1.getFirst();

        // Though here the Deque methods are available like peekFirst, pollFirst, offerLast
        // but currently by base LinkedList methods also we can do a queue
    }
}
