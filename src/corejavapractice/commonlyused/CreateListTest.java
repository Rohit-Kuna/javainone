package corejavapractice.commonlyused;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CreateListTest {

    public static void main(String... args) {
        
        // Creating an array
        String[] strArray = { "apple", "banana", "orange" };
        Arrays.sort(strArray);

        // Creating a fixed list
        List<String> fixedList=Arrays.asList("apple", "banana", "orange");
        System.out.println(fixedList.getClass()); // class java.util.Arrays$ArrayList
        
        // Immutable List
        List<String> immutableList = List.of("apple", "banana", "orange");
        System.out.println(immutableList.getClass()); // class java.util.ImmutableCollections$ListN

        // Modifiable arrayList
        List<String> modifiableArrayList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        System.out.println(modifiableArrayList.getClass()); // class java.util.ArrayList

    }

}

