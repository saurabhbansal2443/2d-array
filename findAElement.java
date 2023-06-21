public class findAElement {
    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13, 14, 15 },
                         { 21, 22, 23, 24, 25 },
                         { 31, 32, 33, 34, 35 }
                       };

            int k = 23;

            int ridx=-1;
            int cidx = -1;

            for(int r=0;r<matrix.length;r++){
                for(int c =0;c<matrix[0].length;c++){
                    if( matrix[r][c]==k){
                        ridx=r;
                        cidx=c;
                    }
                }
            }

            System.out.println(ridx + "   " + cidx);



            
    }
}
