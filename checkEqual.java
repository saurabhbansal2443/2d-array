public class checkEqual {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3, 4, 9 },
                { 3, 4, 5, 78, 9 },
                { 2, 6, 87, 4, 3 }
        };

        int[][] arr2 = { { 1, 2, 3, 4, 9 },
                { 3, 4, 5, 78, 9 },
                { 2, 66, 87, 4, 3 }
        };


        boolean flag = true ;

        if( arr1.length == arr2.length && arr1[0].length == arr2[0].length){


            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[0].length;j++){
                    if(arr1[i][j] != arr2[i][j]){
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
