import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,23,53,32,14,21,12,84,56,45};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        quicksort(arr, 0, arr.length-1);
    }

    private static void quicksort(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        int pivo = arr[(left+right)/2];

        while(left <= right) {
            while(arr[left] < pivo) left++;
            while(arr[right] > pivo) right--;

            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        if(start < right) quicksort(arr,start,right);

        if(left < end) quicksort(arr,left,end);
    }
}