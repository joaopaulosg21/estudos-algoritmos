package utils;

public class Utils {
    
    public static int[] generateRandom(int length) {
        int[] result = new int[length];

        for(int i=0; i < length;i++) {
            result[i] = (int) (Math.random() * 1000);
        }

        return result;
    }
}
