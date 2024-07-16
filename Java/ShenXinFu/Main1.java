package Java.ShenXinFu;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int i = sc.nextInt();
        sc.nextLine();
        int[][] nums = new int[r][c];
        for (int j = 0; j < r; j++) {
            String str = sc.nextLine();
            for (int k = 0; k < c; k++) {
                nums[j][k] = str.charAt(k)-48;
            }
        }
    }
    public static void gameOfLife(int[][] board){
        int[] nb = {0,1,-1};
        int rows = board.length;
        int cols = board[0].length;

        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live = 0;

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(!(nb[k]==0) &&nb[l]==0){
                            int r = i+nb[k];
                            int c = j+nb[l];

                            if((r<rows && r>=0) && (c<cols && c>=0) && (Math.abs(board[r][c])==1)){
                                live += 1;
                            }
                        }
                    }
                }
            }
        }

    }
}
