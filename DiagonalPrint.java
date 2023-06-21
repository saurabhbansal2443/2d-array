public class DiagonalPrint {
    public static void main(String[] args) {
        int[][] arr ={{11,12,13,14}
                     ,{21,22,23,24}
                     ,{31,32,33,34}
                     ,{41,42,43,44}};

        for(int k=0;k<arr.length;k++){
          
            // basic print loop 
            for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[0].length;c++){
                    if( r+k==c){
                        System.out.println(arr[r][c]);
                    }
                }
            }
        }             
    }
}
