package collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateList {
    public static void main(String[] args){
        // Ways to create a list

        // Array
        String[] strArr={"orange","apple","pineapple"};

        // fixed list as it is actually an array with deinite size using Arrays.asList()
        List<String> array=Arrays.asList("ali","abdaal"); // class java.util.Arrays$ArrayList
        // in fixed list can set
        array.set(0,"saif");

        // immutable
        List<String> immutableList=List.of("hritik","roshan"); // class java.util.ImmutableCollections$ListN
        // immutable cannot set
        // immutableList.set(0,"suzainne"); // runtime error


        // mutable
        List<String> mutableList=new ArrayList<>();
        
        mutableList.add("a");
        mutableList.add("b");
        mutableList.add("b"); // duplicates allowed

        // We can pass initial capacity
        List<String> mutableList2=new ArrayList<>(10); //initial capacity

        // directly we can pass a collection
        List<String> listInit=new ArrayList<>(Arrays.asList("c","d")); // passing a collection
        
        mutableList2.addAll(mutableList);

    }
}
