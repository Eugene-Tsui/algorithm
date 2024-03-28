package Java.LeetCode;

public class T240 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int i=0;
        int j=matrix.length-1;
        while(matrix[i][j]!=target){

            if(matrix[i][j]>target){
                j--;
                if( j<0) return false;
            }else{
                i++;
                if(i>=matrix[0].length) return false;
            }
        }

        return true;
    }
}
