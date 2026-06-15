package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

    public static void main(String[] args){
        // NavigableSet is the interface, where as TreeSet is the implementation class
        NavigableSet<Integer> s1=new TreeSet<>();
        s1.add(8);
        s1.add(6);
        s1.add(9);
        s1.add(3);
        s1.add(5);

        s1.lower(5);
        s1.higher(6);
        s1.ceiling(8);
        s1.floor(4);


    }

}
