package collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

import java.util.Set;

public class SortedSetTest {
    public static void main(String[] args){
        // SortedSet is an interface, whereas TreeSet is the implementation class
        SortedSet<Integer> s1=new TreeSet<>();
        s1.add(8);
        s1.add(6);
        s1.add(9);
        s1.add(3);
        s1.add(5);

        s1.first();
        s1.last();

        Set<Integer> subSet1=s1.subSet(2, 7); // to get numbers in the range
        System.out.println(subSet1);

        s1.headSet(6); // until
        s1.tailSet(3); // from
        


    }
}
