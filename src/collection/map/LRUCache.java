package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return this.size()>capacity;
    }

    public static void main(String[] args){
        // Can use Map / LinkedHashMap / LRUCache as ref type
        LRUCache<String,Number> fruits = new LRUCache<>(3);
        fruits.put("apple",10);
        fruits.put("banana",12);
        fruits.put("pineapple",4);

        // the least recently accessed element is at the top
        fruits.get("pineapple");
        fruits.get("apple");
        fruits.get("banana");
        fruits.get("apple");
        fruits.put("plum",100); // as pineapple is the least recently accessed will be removed

        System.out.println(fruits);
    }

}
