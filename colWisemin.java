public class colWisemin {
    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13, 14, 15 },
                         { 21, 22, 23, 24, 25 },
                          { 31, 32, 33, 34, 35 }
                      };


          int min = Integer.MAX_VALUE;     
          
          for(int c =0;c<matrix[0].length;c++){
            int currSum =0;
            for(int r=0;r<matrix.length;r++){
                currSum+=matrix[r][c];
            }

            min = Math.min(min, currSum);
          }

          System.out.println(min);
    }
}
