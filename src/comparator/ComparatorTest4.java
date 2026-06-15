package comparator;

import java.util.Arrays;

public class ComparatorTest4 {
    public static void main(String[] args) {
        int[][] matrix={{35,4},{8,9},{42,6}};

        // Using lambda expression
        // These are still anonymous class
        // In anonymous class we need to implement the abstract methods of the Interface right
        // Lambda exp is a different syntax to do the same
        // Think of it conceptually like writing a function with no name, access modifier or return type
        // Remember: In Java functions are not first class citizens so "stripped / anonymous function" just conceptually 
        // Mann ki aankhon se
        Arrays.sort(matrix, // new Comparator<int[]>() {

            // Override
            /*public int compare*/(int[] a, int[] b)->{ 
                return Integer.compare(a[0],b[0]);
            }

        // }
        );

        // how it looks
        Arrays.sort(matrix,
            (int[] a, int[] b)->{ 
                return Integer.compare(a[0],b[0]);
            }
        );

        // cleanest version
        Arrays.sort(matrix,(a,b)->Integer.compare(a[0],b[0]));
    }
}
