public class RowWiseMax {
    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13, 14, 15 },
                         { 21, 22, 23, 24, 25 },
                          { 31, 32, 33, 34, 35 }
                      };

       int max = Integer.MIN_VALUE;

       for(int r=0;r<matrix.length;r++){

        int currSum = 0;
        for(int c=0;c<matrix[0].length;c++){
            currSum=currSum+matrix[r][c];
        }

        max = Math.max(max, currSum);


       }

       System.out.println(max);

    }
}
