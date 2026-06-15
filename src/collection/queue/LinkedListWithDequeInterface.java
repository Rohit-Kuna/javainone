package collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListWithDequeInterface {
    public static void main(String[] args){
        Deque<Integer> dq1=new LinkedList<>();

        // enqueue methods
        dq1.offerFirst(4);
        dq1.offerLast(8);

        // peek
        dq1.peekFirst();
        dq1.peekLast();

        // dequeue methods
        dq1.pollFirst();
        dq1.pollLast();

        // Similarly add and remove corresponding methods are also available
    }
}
