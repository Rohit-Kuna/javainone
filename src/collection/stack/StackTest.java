package collection.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<Integer> s1=new Stack<>(); // Stack is from Java 1, legacy

        // size
        s1.size();

        // is empty
        s1.isEmpty();

        // all list methods are available as Stack extends Vector
        // add, remove, set, etc

        // stack methods
        s1.push(2); // O(1) -> amortized as it uses array internally, if size increases, a new array is created with 1.5 times the size and elements are copied into the new array

        s1.pop(); // removes the topmost element -> O(1)

        s1.peek(); // just peeks the topmost or last added element without removing it

        /* equality */
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        s2.push(1);s3.push(1);
        s2.push(3);s3.push(3);
        s2.equals(s3);// O(m+n)

        /* sort */
        s1.sort(null); // O(n*logn)

        /* Traverse */
        

    }
}
