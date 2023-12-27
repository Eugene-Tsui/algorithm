package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flag[i][j] = false;
            }
        }
        //{0,1}为向右，{1,0}为向下，{0,-1}为向左，{-1,0}为向上
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};

        List<Integer> result = new ArrayList<>();

        int  i=0,j=0,res=0,dir=0;

        if(matrix.length == 0 || matrix == null){
            return result;
        }

        while(result.size()<row*col){
            System.out.println(Arrays.toString(direction[dir % 4]));
            System.out.println("i j: "+i+" "+j);
            int nextI = i+direction[dir%4][0];
            int nextJ = j+direction[dir%4][1];
            System.out.println("nextI nextJ: "+nextI+" "+ nextJ);

            //改变方向
            if(nextI<0 || nextJ<0 || nextI>=row || nextJ>=col || flag[nextI][nextJ]){
                dir++;
            }
            System.out.println(matrix[i][j]);
            result.add(matrix[i][j]);
            flag[i][j] = true;
            res++;
            i = i+direction[dir%4][0];
            j = j+direction[dir%4][1];

        }

        return result;
    }
}
