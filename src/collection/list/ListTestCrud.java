package collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ListTestCrud {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>(Arrays.asList("a","b","c","d"));

        // size
        int k=l1.size();
        
        // add into list
        // TC: O(1), Worst case : O(n) in case of resizing occurs
        l1.add("e");

        // check if element exists
        l1.contains("b");

        // get element by id
        // TC: O(1)
        l1.get(2);

        // update
        // TC: O(1)
        // obj1.set(index, element);
        l1.set(3,"p");

        // remove from list
        // TC: O(n) as shifting happens
        l1.remove(0); // index
        l1.remove("b"); // object removes first occurence of the object

        // sorting
        l1.sort(null); // same as naturalOrder
        l1.sort(Comparator.naturalOrder());

        // can also use Collection static method
        Collections.sort(l1,null);

        // sublist
        // subList(int fromIndex inclusive, int toIndex exclusive )
        List subList=l1.subList(2, 3);
        System.out.println(subList);

        l1.spliterator();
        System.out.println(l1);

        // to array
        // simplest
        Object[] array=l1.toArray();
        String[] l2=l1.toArray(new String[0]); //convention to pass new Type[0] - just to mention the type

        
    }
}
