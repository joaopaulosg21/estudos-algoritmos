package sort;

import java.util.Arrays;

import utils.Utils;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = Utils.generateRandom(10);

        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int menorIndice = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[menorIndice]) {
                    menorIndice = j;
                }
            }

            if (i != menorIndice) {
                int temp = arr[i];
                arr[i] = arr[menorIndice];
                arr[menorIndice] = temp;
            }
        }
    }
}