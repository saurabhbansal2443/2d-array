import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 9 },
                        { 3, 4, 5, 78, 9 },
                        { 2, 6, 87, 4, 3 }
                      };

        int[][] res = new int[arr.length][arr[0].length] ;

        
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                res[i][j] = arr[i][j];
            }

        }

        System.out.println(Arrays.deepToString(res));
    }
}
