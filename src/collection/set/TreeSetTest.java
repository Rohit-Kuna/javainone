package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        // use ref as Set when we only need the set to be sorted and ops same as Set
        Set<Integer> s1=new TreeSet<>();

        s1.add(8);
        s1.add(6);
        s1.add(9);
        s1.add(3);
        s1.add(5);

        System.out.println(s1); // sorted
    }
}
