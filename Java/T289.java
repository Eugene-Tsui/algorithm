package Java;

import java.util.Arrays;

public class T289 {
    public static void main(String[] args) {
        int [][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }
    public static void gameOfLife(int[][] board) {

        int [][] copy = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i],0,copy[i],0,board[0].length);
        }

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[0].length; j++) {
                int res = returnLive(i,j,copy);
                if(copy[i][j] == 0 && res==3){

                    board[i][j] = 1;

                } else if (copy[i][j] == 1) {

                    if(res<2 || res>3){
                        board[i][j] = 0;
                    }else {
                        board[i][j] = 1;
                    }

                }
            }
        }


    }

    public static int returnLive(int i,int j,int[][] copy){
        int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        int num=0;
        for (int k = 0; k < 8; k++) {

            int newI = i+dir[k][0];
            int newJ = j+dir[k][1];

            if(newI<0 || newJ<0 || newI==copy.length || newJ==copy[0].length){
                continue;
            }
            if(copy[newI][newJ]==1){
                num++;
            }
        }
        return num;
    }
}
