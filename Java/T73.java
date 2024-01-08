package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T73 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,0,7,8},
                {9,10,11,12}

        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    public static void setZeroes(int[][] matrix) {

        List<Integer> listRow = new ArrayList<>();
        List<Integer> listCol = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(0 == matrix[i][j]){
                    listRow.add(i);
                    listCol.add(j);
                }
            }
        }


        for (int i = 0; i < listRow.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[listRow.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < listCol.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][listCol.get(i)] = 0;
            }
        }



    }
}
