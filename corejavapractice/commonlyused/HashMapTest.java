package corejavapractice.commonlyused;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.List;

public class HashMapTest {
    public static void main(String[] args) {
        // Create a HM
        Map<String,Integer> hm1=new HashMap<>();
        // put
        hm1.put("apple",3);
        hm1.put("banana",4);
        hm1.put("mango",2);
        // get
        hm1.get("apple");
        
        // getOrDefault(key,defaultValue) -> returns default value when key doesn't exist (safe get)
        hm1.getOrDefault("orange", 0); // if orange doesn't exist the count of orange will be returned as 0
        // useful in forming count hm

        // check if key exists
        hm1.containsKey("strawberry"); // O(1)
        hm1.containsValue(3); // O(n)

        // getting all keys or all values separately
        Set<String> keys=hm1.keySet();
        System.out.println(keys);
        Collection<Integer> vals = hm1.values();
        System.out.println(vals);

        // entry set
        Object entryObj = hm1.entrySet();
        System.out.println(entryObj.getClass());
        Set<Map.Entry<String,Integer>> entryObj2 = hm1.entrySet();

        // iterate through entrySet
        for(Map.Entry<String,Integer> entry: entryObj2){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // using lambda
        // Map class has forEach default method which takes BiConsumer
        hm1.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

    }
}

