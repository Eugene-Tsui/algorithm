package Java.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class T406 {
    public static void main(String[] args) {
        int[][] people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] result = reconstructQueue(people);
        for(int[] res: result){
            System.out.println(Arrays.toString(res));
        }

    }

    public static int[][] reconstructQueue(int[][] people) {
        LinkedList<int[]> result = new LinkedList<>();

//        Arrays.sort(people, (o1, o2) -> (o2[0] - o1[0]));
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0]==o2[0]) return o1[1]-o2[1];
            return o2[0]-o1[0];
        });
        for (int[] aaa : people) {
            System.out.print(Arrays.toString(aaa));
        }
        System.out.println();
        for (int[] person : people) {
            result.add(person[1], person);
            for (int[] bbb : result) {
                System.out.print(Arrays.toString(bbb));
            }
            System.out.println();
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
