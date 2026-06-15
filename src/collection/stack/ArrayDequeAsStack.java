package collection.stack;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args){

        // Interface Deque can also be used but as it's stack it's better to go with ArrayDeque,
        // we don't intend to use Deque methods
        ArrayDeque<Integer> s1=new ArrayDeque<>();

        /* SIZE */
        s1.size(); // O(1)

        // isEmpty
        s1.isEmpty();

        s1.push(3);
        s1.pop();
        s1.peek();

        // equality
        s1.equals(s1);

        // traverse
        s1.push(5);s1.push(10);s1.push(20);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }

    }
}
