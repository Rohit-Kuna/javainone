package misc;

public class Matrix2D {
    public static void main(String[] args){
        int[][] matrix={{12,34,6},{4,5,6},{9,6,0}};

    }

    // traverse matrix
    private void display(int[][] matrix){
        for(int i=0;i<=matrix.length;i++){
            for(int j=0;j<=matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
