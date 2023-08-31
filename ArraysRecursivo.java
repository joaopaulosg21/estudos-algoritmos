public class ArraysRecursivo{

    public static void main(String[] args) {
        int[] arr = {1,2,233,4,5,6,7,232};

        System.out.println(binarySearch(arr, 7, 0, arr.length-1));
    }

    public static int soma(int[] arr, int n) {

        if(n == 1) return arr[0];

        return arr[n-1] + soma(arr,n-1);
    }

    public static int max(int[] arr, int n) {
        if(n == 1) return arr[0];

        int max = max(arr,n-1);

        if(arr[n-1] > max) max = arr[n - 1];

        return max;
    }

    public static int binarySearch(int[] arr, int target, int min, int max) {

        int mid = (min+max)/2;

        if(arr[mid] == target) return mid;

        if(arr[mid] > target) {
            return binarySearch(arr, target, min, mid-1);
        }

        if(arr[mid] < target) {
            return binarySearch(arr, target, mid+1, max);
        }

        return -1;
    }
}