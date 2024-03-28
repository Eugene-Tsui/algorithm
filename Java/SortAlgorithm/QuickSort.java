package Java.SortAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            int position = partition(array, low, high);
            quickSort(array, low ,position-1);
            quickSort(array, position+1, high);
        }
    }
    public static int partition(int[] array, int low, int high){
        int val = array[low];
        int left=low;
        int right=high;
        while(left<right){
            while(left<right && array[right]>val){
                right--;
            }
            while(left<right && array[left]<=val){
                left++;
            }
            if(left<right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                right--;
                System.out.println(Arrays.toString(array));
            }
        }

        array[low] = array[left];
        array[left] = val;
        return left;
    }
}
