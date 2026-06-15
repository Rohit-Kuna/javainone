package comparator;

import java.util.Comparator;
import java.util.Arrays;

public class ComparatorTest2 {
    public static void main(String[] args) {
        int[][] matrix={{3,4},{5,6},{91,78}};

        // Anonymous class using Interface<T>(){...} syntax
        // reference types -> all super types i.e. class, Interfaces are allowed
        Comparator<int[]> instance=new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[0]);
            }
        };
        // Interface<T>(){....}; -> creating Class
        // new Class; -> creating an object
        // This syntax is synctactic sugar

        Arrays.sort(matrix,instance);
    }
}
