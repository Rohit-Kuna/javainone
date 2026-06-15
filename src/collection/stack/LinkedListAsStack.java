package collection.stack;

import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args){

        // Can't put Stack as refernce type as it's legacy not Collection framework
        LinkedList<Integer> s1=new LinkedList<>();
        // Stack is LIFO
        // push -> add last
        // pop -> remove last
        // peek -> getLast
        s1.addLast(1); // push(element)
        s1.getLast(); // or s1.peekLast(); // peek()
        s1.removeLast(); // pop()
    }
}
