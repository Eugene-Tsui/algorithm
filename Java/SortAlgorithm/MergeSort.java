package Java.SortAlgorithm;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] sort_arr = mergeSort(array);
        System.out.println(Arrays.toString(sort_arr));
    }

    private static int[] mergeSort(int[] array) {
        if(array.length<=1){
            return array;
        }
        int mid = array.length/2;
        int[] arr1 = Arrays.copyOfRange(array, 0, mid);
        int[] arr2 = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(arr1), mergeSort(arr2));
    }
    private static int[] merge(int[] arr1, int []arr2){

        int idx = 0, idx1 = 0,idx2 = 0;
        int[] arr_sort = new int[arr1.length+arr2.length];
        while(idx1<arr1.length && idx2<arr2.length){
            if(arr1[idx1] < arr2[idx2]){
                arr_sort[idx] = arr1[idx1];
                idx1++;
            }else if(arr1[idx1]>=arr2[idx2]){
                arr_sort[idx] = arr2[idx2];
                idx2++;
            }
            idx++;
        }
        while(idx1<arr1.length){
            arr_sort[idx] = arr1[idx1];
            idx++;
            idx1++;
        }
        while(idx2<arr2.length){
            arr_sort[idx] = arr2[idx2];
            idx++;
            idx2++;
        }

        return arr_sort;

    }

}
