public class Average {
    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13, 14, 15 },
                         { 21, 22, 23, 24, 25 },
                          { 31, 32, 33, 34, 35 }
                      };

          int sum =0;
          
          for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                sum+=matrix[r][c];
            }
          }

          int numberOfElements = matrix.length * matrix[0].length;

          int ans = sum/numberOfElements;

          System.out.println(ans);
    }
}
