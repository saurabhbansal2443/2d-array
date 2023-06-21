public class ExitPoint {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,1,0}
                      ,{0,0,1,0,1}
                      ,{0,1,0,1,0}
                      ,{0,0,0,0,0}};

          int r = 0;
          int c = 0;
          
          int dir =0;

          while(true){

            dir = (dir+matrix[r][c])%4;


            if( dir ==0){
                c++;
            }else if ( dir ==1){
                r++;
            }else if ( dir ==2){
                c--;
            }else if ( dir ==3){
                r--;
            }

            if( r == matrix.length){
                r--;
                break;
            }else if ( r < 0){
                r++;
                break;
            }else if ( c == matrix[0].length){
                c--;
                break;
            }else if( c < 0){
                c++;
                break;
            }


          }

          System.out.println(r+"  " +c);
    }
}
