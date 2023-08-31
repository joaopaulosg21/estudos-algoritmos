import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i < 10;i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(sort(arr)));
    } 

    private static int[] sort(int[] arr) {

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

        return arr;
    }
}