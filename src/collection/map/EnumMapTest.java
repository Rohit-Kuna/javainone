package collection.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapTest {
    public static void main(String[] args){
        Map<Day,String> m1=new EnumMap<>(Day.class);
        m1.put(Day.SATURDAY,"Paint");
        m1.put(Day.MONDAY,"Run");
        m1.put(Day.WEDNESDAY,"Chill");

        /*
         * Internally it is an array _,_,_,_,_ and the indexes are ordinals, so no hashing or rehashing
         */

        System.out.println(m1); // irrespective of the insertion order, the order is as per the enum

    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
