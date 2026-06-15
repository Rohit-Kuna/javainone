package collection.map;

import java.util.Map;
import java.util.HashMap;

public class WaysToCreateHashMap {
    public static void main(String[] args){

        // Creating a HashMap with initial capacity
        Map<Integer,String> hm0=new HashMap<>();
        // equivalent to
        Map<Integer,String> hm00=new HashMap<>(16,0.75f);
        // initial capacity of a hashmap is 16 by default
        // load factor by deafult is 0.75f i.e. 3/4th
        // when the array bucket of Hashmap is 3/4th filled i.e. "16*0.75 = 12" then, it doubles internal capacity

        Map<Integer,String> hm1=new HashMap<>(4); // Suppose the initial cap is 4
        hm1.put(1,"Rahul");
        hm1.put(2,"Adria");
        hm1.put(3,"Helen"); // now 3/4th is filled (realistically maybe not as bucket should be filled if collision occured the element would be inserted in the LinkedList not the array bucket)
        hm1.put(4,"Klint"); // HashMap get's doubled as 3/4th of the hm is filled and load factor is 0.75

        // Creating a HashMap with capacity and loadfactor
        Map<Integer,String> hm2 = new HashMap<>(6,0.5f); // means as soon as capacity of this Hm is half filled it gets doubled
        hm2.put(1,"Rahul");
        hm2.put(2,"Adria");
        hm2.put(3,"Helen"); // now half is filled i.e. 3 (realistically maybe not as bucket should be filled if collision occured the element would be inserted in the LinkedList not the array bucket)
                            // capacity is doubled i.e. 6*2 = 12
        hm2.put(4,"Klint");

    }
}
