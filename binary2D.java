import java.util.Arrays;

public class binary2D {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {16,26,36,46},
                {21,28,41,50}
        };
        int target= 45;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] matrix ,int tgt){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length&&c>=0){
            if(matrix[r][c]==tgt){
                return new int[]{r,c};
            }
            if(matrix[r][c]>tgt){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
