package Java;

import java.util.Arrays;

public class T167 {
    public static void main(String[] args) {
        int[] number = {0,0,3,4};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(number, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for(int j=i+1; j< numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
