import java.util.*;

public class reverseRows {
    public static void main(String[] args) {

        int[] arr1 = { 11, 12, 13, 14 };
        int[] arr2 = { 21, 22, 23, 24 };
        int[] arr3 = { 31, 32, 33, 34 };
        int[] arr4 = { 41, 42, 43, 44 };

        int[][] matrix = { arr1, arr2, arr3, arr4 };

        for (int i = 0; i < matrix.length; i++) {

            int[] target = matrix[i];
            // this is just reversing the array  
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
