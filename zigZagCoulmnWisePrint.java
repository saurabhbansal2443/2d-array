public class zigZagCoulmnWisePrint {
    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13, 14, 15 },
                         { 21, 22, 23, 24, 25 },
                         { 31, 32, 33, 34, 35 }
                       };

          // 1st way using even odd   
    //    for(int c=0;c<matrix[0].length;c++){
           
    //         if(c%2==0){
    //             for(int r=0;r<matrix.length;r++){
    //                 System.out.println(matrix[r][c]);
    //             }
    //         }else{
    //             for(int r=matrix.length-1;r>=0;r--){
    //                 System.out.println(matrix[r][c]);
    //             } 
    //         }
    //    }

       // 2nd way using boolean flag 

       boolean flag = true ;

       for(int c=0;c<matrix[0].length;c++){
           
        if(flag == true ){
            for(int r=0;r<matrix.length;r++){
                System.out.println(matrix[r][c]);
            }
            flag = false;
        }else{
            for(int r=matrix.length-1;r>=0;r--){
                System.out.println(matrix[r][c]);
            } 
            flag = true ;
        }
   }
    }
}
