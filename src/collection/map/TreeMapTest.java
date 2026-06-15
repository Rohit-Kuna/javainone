package collection.map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapTest {
    public static void main(String[] args){
        Map<Integer,String> mp1=new TreeMap<>();
        mp1.put(3,"Punit");
        mp1.put(5,"Hitesh");
        mp1.put(1,"Olga");

        System.out.println(mp1);
    }
}
