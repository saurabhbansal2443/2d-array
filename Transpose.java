import java.util.Arrays;

public class Transpose {
   public static void main(String[] args) {
        int[][] arr ={{11,12,13,14}
                     ,{21,22,23,24}
                     ,{31,32,33,34}
                     ,{41,42,43,44}};


           for(int r=0;r<arr.length;r++){
            for(int c=r;c<arr[0].length;c++){
                int k = arr[r][c];
                arr[r][c]=arr[c][r];
                arr[c][r]=k;
            }
           }  
           
           System.out.println(Arrays.deepToString(arr));
   } 
}
