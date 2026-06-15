package collection.map;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        String p0 = "p0"; // This is a strong ref
        WeakReference<String> p1=new WeakReference<>("p1"); // This is a weak ref and after some time gc can clean it
        System.gc();
        try{
            Thread.sleep(10000);
        } catch(Exception ignore){
            // TO-DO
        }
        System.out.println(p0);
        System.out.println(p1);

        // until and unless the key ref is there the value is not
        WeakHashMap<String,Integer> persons=new WeakHashMap<>();
        persons.put(new String("p1"), 1);
        persons.put(new String("p2"), 2);

        System.out.println(persons);
        System.gc();

        try{
            Thread.sleep(5000);
        } catch(Exception ignore){
            // TO-DO
        }

        System.out.println(persons);

    }
}
