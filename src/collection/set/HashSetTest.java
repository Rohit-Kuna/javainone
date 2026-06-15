package collection.set;

import java.util.Set;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>();
        s1.add(2);
        s1.add(6);
        s1.add(6); // duplicate, hence not added in the set

    }
}
