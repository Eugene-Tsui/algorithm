package Java;

import java.util.Arrays;
import java.util.HashSet;

public class T36 {
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'1','.','3','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},

                {'9','.','.','.','3','.','.','.','.'},
                {'2','.','.','9','5','.','.','.','.'},
                {'3','.','.','.','1','.','.','.','.'},

        };


        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!set.contains(board[i][j])){
                        set.add(board[i][j]);
                    }else{
                        return false;
                    }
                }
            }
        }

        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] != '.'){
                    if(!set.contains(board[j][i])){
                        set.add(board[j][i]);
                    }else{
                        return false;
                    }
                }
            }
        }

        int[][][] a = new int[3][3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Arrays.fill(a[i][j],0);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.'){
                    int b = board[i][j] - '0';
                    System.out.println(b);
                    a[i/3][j/3][b-1]++;
                    if(a[i/3][j/3][b]>1){
                        return false;
                    }

                }

            }
        }

        return true;
    }
}
