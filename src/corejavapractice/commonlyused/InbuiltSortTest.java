package corejavapractice.commonlyused;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class InbuiltSortTest {

    // sort functions
    // Arrays.sort();
    // Collections.sort()

    public static void main(String[] args){
        // sorting in array
        int[] numsPrimitive= {1,9,3,42,5,2};
        Arrays.sort(numsPrimitive); // asc
        // We can't pass Comparator.reverseOrder() in Arrays.sort() for primitive data

        // Therefore we can use Integer instead, if we wanna pass comparator
        Integer[] numsInteger = {2,18,5,9,4};
        Arrays.sort(numsInteger, Comparator.reverseOrder());
        // for natural order
        Arrays.sort(numsInteger,Comparator.naturalOrder());

        // sorting in collection (can create list using any List creation method)
        List<String> letters = Arrays.asList("C","D","B","A");
        Collections.sort(letters);

        // naturalOrder
        Comparator<String> natural = Comparator.naturalOrder();
        // reverseOrder
        Comparator<String> rev1 = Comparator.reverseOrder();
        Comparator<String> rev2 = Collections.reverseOrder();

        // So we can pass it in sort() as Comparator
        Collections.sort(letters,Collections.reverseOrder());
        Collections.sort(letters,Comparator.reverseOrder());
        
        //we can also do
        letters.sort(Comparator.naturalOrder()); // Note: Comparator needs to be passed atleast as Comparator.naturalOrder (so that if class have Overidden compareTo i.e. Comparable get's activated)
        
        // This is completely different not sorting descending order but only mirrors current order 
        List<Integer> numsList = Arrays.asList(3,2,6,1,8);
        Collections.reverse(numsList); // reverse
        System.out.println(numsList); // [8, 1, 6, 2, 3]

    }

}

