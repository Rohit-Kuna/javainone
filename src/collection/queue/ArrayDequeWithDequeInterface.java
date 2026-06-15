package collection.queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeWithDequeInterface {
    public static void main(String[] args){
        Deque<Integer> dq1=new ArrayDeque<>();

        // enqueue methods
        dq1.offerFirst(4);
        dq1.offerLast(8);

        // peek
        dq1.peekFirst();
        dq1.peekLast();

        // dequeue methods
        dq1.pollFirst();
        dq1.pollLast();

    }
}
