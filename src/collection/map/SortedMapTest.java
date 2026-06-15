package collection.map;

import java.util.TreeMap;
import java.util.SortedMap;

public class SortedMapTest {
    public static void main(String[] args){
        SortedMap<Integer,String> hm1=new TreeMap<>();
        hm1.put(6,"Kyle");
        hm1.put(2,"John");
        hm1.put(5,"Lynn");
        hm1.put(4,"Patryk");

        System.out.println(hm1);

        hm1.firstKey();
        hm1.lastKey();
        hm1.tailMap(2); // 2 to end
        hm1.headMap(3); // till 3
        System.out.println(hm1.subMap(2,5)); // keys between 2 to 5 excluding 5

    }
}
