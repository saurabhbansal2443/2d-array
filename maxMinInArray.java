public class maxMinInArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 9 },
                        { 3, 4, 5, 78, 9 },
                        { 2, 6, 87, 4, 3 } 
                      };


         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if( max < arr[i][j]){
                    max = arr[i][j];
                }

                if( min > arr[i][j]){
                    min = arr[i][j];
                }
            }
         }

         System.out.println(max);
         System.out.println(min);
    }
}
