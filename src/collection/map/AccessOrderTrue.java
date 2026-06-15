package collection.map;

import java.util.Map;
import java.util.LinkedHashMap;

public class AccessOrderTrue {
    public static void main(String[] args){
        // LinkedHashMap can also be used as ref type
        Map<String,Number> fruits = new LinkedHashMap<>(16,0.75f,true);
        fruits.put("apple",10);
        fruits.put("banana",12);
        fruits.put("pineapple",4);

        // the least recently accessed element is at the top
        fruits.get("pineapple");
        fruits.get("apple");
        fruits.get("banana");
        fruits.get("apple");

        System.out.println(fruits);

    }
}
