package collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapTest {
    public static void main(String[] args){

        NavigableMap<Integer,String> hm1=new TreeMap<>();
        hm1.put(6,"Kyle");
        hm1.put(2,"John");
        hm1.put(5,"Lynn");
        hm1.put(4,"Patryk");

        // All SortedMap methods + the following
        System.out.println(hm1.higherKey(2));
        System.out.println(hm1.lowerKey(8));
    }
}
