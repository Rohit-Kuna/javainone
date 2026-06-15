package misc;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Snippets{
    public static void main(String[] args){

        // max in array
        int[] arr={1,23,30,14,5};
        int max=Arrays.stream(arr).max().getAsInt();

        // similarly sum
        int sum=Arrays.stream(arr).sum();

        // In 2D array sort by 1st value asc
        int[][] matrix={{11,2},{2,3},{6,8}};
        Arrays.sort(matrix,(a,b)->Integer.compare(a[0],b[0]));
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // Convert array to stream
        IntStream intStream=Arrays.stream(arr);
        // Integer Stream
        Stream<Integer> integerStream=Arrays.stream(arr).boxed();

        // what is boxed and mapToInt


    }

    static int getMax(int[] arr){
        int res=Integer.MIN_VALUE;
        for(int p:arr){
            if(p>res){
                res=p;
            }
        }
        return res;
    }
}
