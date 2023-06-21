public class findInRowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{11,21,22,23}
                      ,{41,44,48,50}
                      ,{62,64,72,79}
                      ,{91,95,97,100}
                      };

        int k=11;
        
        int r=0;
        int c=arr[0].length-1;

        int ra=-1;
        int ca=-1;

        while(r<arr.length && c>=0){
            if(k==arr[r][c]){
                ra=r;
                ca=c;
                break;
            }else if(k<arr[r][c]){
                c--;
            }else if(k>arr[r][c]){
                r++;
            }
        }

        System.out.println(ra + "   " +ca);
}
}
