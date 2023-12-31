public class spiralTraversal {
    public static void main(String[] args) {
        int[][] matrix ={{11,12,13,14,99}
                     ,{21,22,23,24,98}
                     ,{31,32,33,34,97}
                     ,{41,42,43,44,96}
                     ,{51,52,53,54,95}};

         int ele = matrix.length * matrix[0].length;
         
         int count =0;

         int rowmin =0;
         int rowmax =matrix.length-1;
         int colmin =0;
         int colmax=matrix[0].length-1;

         while( count<ele){

            // 1st loop it will print the minimum column boundary 

            for(int r=rowmin;r<=rowmax && count<ele;r++){
                System.out.println(matrix[r][colmin]);
                count++;
            }

            // 2nd loop it will print the maximum row boundary 

            for(int c=colmin+1;c<=colmax && count<ele;c++){
                System.out.println(matrix[rowmax][c]);
                count++;
            }

            //3rd loop will print the maximum column boundary 

            for(int r=rowmax-1;r>=rowmin && count<ele;r--){
                System.out.println(matrix[r][colmax]);
                count++;
            }

            //4th loop will print the minimum row boundary 

            for(int c=colmax-1;c>=colmin+1 && count<ele;c--){
                System.out.println(matrix[rowmin][c]);
                count++;
            }

            colmin++;
            rowmax--;
            colmax--;
            rowmin++;


         }
    }
}
