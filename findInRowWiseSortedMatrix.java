public class findInRowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{11,21,22,23}
                      ,{41,44,48,50}
                      ,{62,64,72,79}
                      ,{91,95,97,100}
                      };

        int k=11;
        
        int r=0;
        int c=matrix[0].length-1;

        int ra=-1;
        int ca=-1;

        while(r<matrix.length && c>=0){
            if(k==matrix[r][c]){
                ra=r;
                ca=c;
                break;
            }else if(k<matrix[r][c]){
                c--;
            }else if(k>matrix[r][c]){
                r++;
            }
        }

        System.out.println(ra + "   " +ca);
}
}
