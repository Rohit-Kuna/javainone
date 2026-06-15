package misc;

import java.util.Arrays;
import java.util.Comparator;

public class SnippetsPhase1 {
    public static void main(String[] args){

        int[] arr={1,23,76,98};
        // sum
        // max

        int[][] matrix={{1,2},{6,3},{4,5}};
        // sort acc to 1st element
        // using Anonymous function
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0], b[0]);
            }
        });
        // using lambda
        Arrays.sort(matrix,(a,b)->Integer.compare(a[0], b[0]));




    }

    // max
    private int getMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int p : arr){
            if(p>max){
                max=p;
            }
        }
        return max;
    }

    // sum
    private int getSum(int[] arr){
        int sum=0;
        for(int p:arr){
            sum+=p;
        }
        return sum;
    }


}
