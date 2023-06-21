import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
         int[][] matrix ={{11,12,13,14}
                     ,{21,22,23,24}
                     ,{31,32,33,34}
                     ,{41,42,43,44}};

        // Transpose of Matrixay 
           for(int r=0;r<matrix.length;r++){
            for(int c=r;c<matrix[0].length;c++){
                int k = matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=k;
            }
           } 
           
        // reversing the rows of matrix 
        
        for (int i = 0; i < matrix.length; i++) {

            int[] target = matrix[i];
            // this is just reversing the Matrixay  
            int st = 0;
            int end = target.length - 1;

            while (st < end) {
                int temp = target[st];
                target[st] = target[end];
                target[end] = temp;
                 st++;
                end--;
            }

        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
