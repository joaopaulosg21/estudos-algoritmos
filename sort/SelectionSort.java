package sort;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3,23,53,32,14,21,12,84,56,45};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    } 

    private static void sort(int[] arr) {

        for(int i=0; i < arr.length-1;i++) {

            int menorIndice = i;

            for(int j=i; j < arr.length;j++) {
                if(arr[j] < arr[menorIndice]) {
                    menorIndice = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[menorIndice];
            arr[menorIndice] = temp;
        }
    }
}