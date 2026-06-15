package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueMinHeap {
    public static void main(String[] args){
        // Used when we want a min/max heap

        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        minheap.offer(6);
        minheap.offer(8);
        minheap.offer(2);
        minheap.offer(4);

        // for printing sorted order asc
        while(!minheap.isEmpty()){
            int res=minheap.poll();
            System.out.println(res);
        }


    }
}


