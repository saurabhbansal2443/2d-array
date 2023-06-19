public class TwodarrayBasics{
    public static void main(String[] args) {
        //int[][] arr ; // decleration

        int[][] arr = new int[3][4]; // intialization 

        int rowslength = arr.length;
        int collength = arr[0].length;

        //System.out.println(rowslength+"  " + collength);

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[0].length;j++){

                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

    }
}