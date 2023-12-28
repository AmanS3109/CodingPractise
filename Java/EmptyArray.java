package Java;

import java.util.Arrays;

public class EmptyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        arr = new int[0];
        System.out.println(Arrays.toString(arr));
    }
}
