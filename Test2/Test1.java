package Test2;
/*POJ 3984 迷宫问题
 * ժ��https://blog.csdn.net/owenchan1987/article/details/69371884*/
import java.util.*;
public class Test2 {
    static Position[][] maze = new Position[8][8];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {// ȫ����ʼ������Ȼ������ʱ��ᱨ��
            for (int j = 0; j < 8; j++) {
                maze[i][j] = new Position(i, j, 1);// �˹���ǽ��Χ���Թ�������з�Χ
            }
        }
        int[][] operate = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };// ����������������if
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                maze[i][j].value = cin.nextInt();
            }
        }
        Queue<Position> wait = new LinkedList<Position>();
        wait.add(maze[1][1]);
        while (!wait.isEmpty()) {
            Position cur = wait.poll();
            if (cur.x == 5 && cur.y == 5) {
                // д�˸��ݹ飬���յ㿪ʼ���ˣ��������Ϊֹ��ʼ������ﵽ��Ŀ��ͷ�����Ҫ��
                outPut(5, 5);
                break;
            }
            cur.value = 1;// ���Ϊ�߹�
            for (int i = 0; i < 4; i++) {
                int nextX = cur.x + operate[i][0];
                int nextY = cur.y + operate[i][1];
                if (maze[nextX][nextY].value == 0) {
                    wait.add(maze[nextX][nextY]);
                    maze[nextX][nextY].pre = cur;// ��ʽ��¼
                }
            }
        }
        cin.close();
    }

    public static void outPut(int x, int y) {
        if (maze[x][y].pre == null) {
            System.out.println("(0, 0)");
            return;
        }
        outPut(maze[x][y].pre.x, maze[x][y].pre.y);
        int realX = x - 1;
        int realY = y - 1;
        System.out.println("(" + realX + ", " + realY + ")");
    }
}

class Position {
    int x;
    int y;
    int value;
    Position pre;

    public Position(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
}