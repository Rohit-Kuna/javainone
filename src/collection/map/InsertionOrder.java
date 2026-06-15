package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class InsertionOrder {
    public static void main(String[] args){
        // If you want to maintain the insertion order
        Map<String,Integer> fruits=new LinkedHashMap<>();
        fruits.put("orange",2);
        fruits.put("banana",12);
        fruits.put("apple",9);
        fruits.put("pineapple",5);

        System.out.println(fruits);

        // even we can traverse
        for(Map.Entry<String,Integer> entry: fruits.entrySet()){
            System.out.println(entry.getKey());
        }

    }
}
