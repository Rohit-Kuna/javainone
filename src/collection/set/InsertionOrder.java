package collection.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class InsertionOrder {
    public static void main(String[] args){
        Set<Integer> s1=new LinkedHashSet<>();
        s1.add(8);
        s1.add(6);
        s1.add(9);
        s1.add(3);
        s1.add(5);

        System.out.println(s1); // order of Insertion will be maintained
    }
}
