package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,23,53,32,14,21,12,84,56,45};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {

        for(int i=0;i < arr.length;i++) {
            for(int j=arr.length-1;j > i;j--) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
