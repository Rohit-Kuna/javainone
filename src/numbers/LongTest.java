package numbers;

public class LongTest {
    public static void main(String[] args){
        // A. primitive to Object
        // long to Long
        long a= 1000L;

        // auto
        Long A=a;

        // using method XXXX.valueOf()
        Long A1=Long.valueOf(a); // long->Long

        // from String to Integer using X.valueOf()
        String longRes="200L";
        Long A2=Long.valueOf(longRes); // String->Long

        // B. Object to primitive
        // Long to long
        Long B=3000L;
        
        // auto
        long b=B;

        // using obj.longValue()
        long b1=B.longValue();

        // String to primitive
        // String to long
        long b2=Long.parseLong(longRes);

        // C. String to Long/long
        Long C=Long.valueOf(longRes);
        long c=Long.parseLong(longRes);

        // D. min and max
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;

        // E. equality 
        // primitives -> a==b
        boolean eq1=10L==10L;

        // Objects -> obj1.equals(obj2)
        boolean eq2=A.equals(C);

        // F. Compare long / Long
        // use Long.compare()
        int compareRes=Long.compare(10L,20L);
        // res < 0 -> a before b
        // res == 0 -> a == b
        // res > 0 -> a after b

    }
}
