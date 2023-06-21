public class checkEqual {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3, 4, 9 },
                { 3, 4, 5, 78, 9 },
                { 2, 6, 87, 4, 3 }
        };

        int[][] matrix2 = { { 1, 2, 3, 4, 9 },
                { 3, 4, 5, 78, 9 },
                { 2, 66, 87, 4, 3 }
        };


        boolean flag = true ;

        if( matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){


            for(int i=0;i<matrix1.length;i++){
                for(int j=0;j<matrix1[0].length;j++){
                    if(matrix1[i][j] != matrix2[i][j]){
                        flag = false;
                    }
                }
            }
        }else{
            flag = false ;
        }

        System.out.println(flag);

        
    }
}
