package helpers;

import java.util.LinkedList;
import java.util.Queue;

public class Pair<K, V> {
    public K first;
    public V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return this.first + ":" + this.second;
    }

}

class Test{
    public static void main(String[] args){
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(1, 10));
        q.add(new Pair<>(2, 20));
        System.out.println(q);
    }
}


