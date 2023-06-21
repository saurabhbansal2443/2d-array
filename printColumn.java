public class printColumn {
   public static void main(String[] args) {
    int[][] matrix = { { 11, 12, 13, 14, 15 },
                    { 21, 22, 23, 24, 25 },
                    { 31, 32, 33, 34, 35 }
                  };

      // row wise printing 

    //   for(int r=0;r<matrix.length;r++){
    //     for(int c=0;c<matrix[0].length;c++){
    //         System.out.print(matrix[r][c]+"\t");
    //     }
    //     System.out.println();
    //   }
      
      

      // column wise printing 

      for(int c=0;c<matrix[0].length;c++){
        for(int r=0;r<matrix.length;r++){
            System.out.println(matrix[r][c]+"\t");
        }
        //System.out.println();
      }
   } 
}
