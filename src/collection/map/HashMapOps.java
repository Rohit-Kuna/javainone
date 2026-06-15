package collection.map;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapOps {
    public static void main(String[] args){
        Map<String,Integer> hm1=new HashMap<>();

        /* size */
        hm1.size();
        hm1.isEmpty();

        // put key - value pair
        hm1.put("Rahul",98);
        hm1.put("Naina",80);

        /* check existence */
        // if contains key
        hm1.containsKey("Haroon"); // TC -> O(1)

        // if contains value, is basically searching
        hm1.containsValue(92);

        /* access value, by key */
        hm1.get("Naina"); // TC -> O(1)

        // hm.getOrDefault(key,defaultValue) -> useful in case of calculating frequency
        hm1.getOrDefault("Shubham",0);

        // Update or set a value for existing key, use hm.put(sameKey, newVal)
        hm1.put("Naina", 87);

        /* key set */
        // hm.keys() -> returns Set<key's datatype>, as keys are always unique
        Set<String> keys=hm1.keySet();

        // hm.values() -> returns Collection of values
        Collection<Integer> vals=hm1.values();

        /* entrySet */
        Set<Map.Entry<String,Integer>> entrySet1=hm1.entrySet();

        // if you want to iterate
        for(Map.Entry<String,Integer> entry: hm1.entrySet()){
            // methods on Map.Entry<>
            entry.getKey(); // access key
            entry.getValue(); // access value
            entry.setValue(8); // update or set value
        }

        // Important
        Map.Entry<Integer,String> entry=Map.entry(1,"P"); // For a single entry we can also use Map.entry(k,v) method

        // equality
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"Arijit");
        m1.put(2,"B");

        Map<Integer,String> m2=new HashMap<>();
        m2.put(1,"Arijit");
        m2.put(2,"B");

        boolean eq1=m1.equals(m2);
        System.out.println(eq1);

        // Printing Map will automatically pretty print it
        // as HashMap has toString overridden
        System.out.println(hm1);

    }
}
