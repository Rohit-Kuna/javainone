package collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeWithQueueInterface {

    public static void main(String[] args){
        Queue<Integer> q1=new ArrayDeque<>();
        q1.offer(7);
        q1.peek();
        q1.poll();
    }

}
