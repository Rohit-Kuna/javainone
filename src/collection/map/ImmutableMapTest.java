package collection.map;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class ImmutableMapTest {
    public static void main(String[] args){
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"todo");
        hm.put(6,"inprogress");
        hm.put(3,"done");

        Map<Integer,String> immuMap1=Collections.unmodifiableMap(hm);

        Map<Integer,String> immuMap2=Map.of(1,"todo", 2, "inprogress", 3, "done"); // Limitation is only 10 entries can be added

        Map<Integer,String> immuMap3=Map.ofEntries(Map.entry(2, "Kattappa"),Map.entry(3, "Bahubali"));

        // If you remember we can create single entry using Map.entry(k,v)
        Map.Entry<Integer,String> entry=Map.entry(1,"P");

    }
}
