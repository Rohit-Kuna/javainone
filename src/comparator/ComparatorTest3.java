package comparator;
import java.util.Arrays;
import java.util.Comparator;
public class ComparatorTest3 {
    public static void main(String[] args){
        int[][] matrix={{3,4},{5,6},{91,78}};
        
        // Comparator anonymous class
        Arrays.sort(matrix, new Comparator<int[]>() {

            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[1]);
            } 
            
        });
    }
}
