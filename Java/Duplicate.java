package Java;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] duplicatedArr = Duplication(arr);
        System.out.println(Arrays.toString(duplicatedArr));
    }
    public static int[] Duplication(int[] arr){
        int[] duplicatearray = new int[arr.length * 2];
        System.arraycopy(arr, 0, duplicatearray, 0, arr.length);
        System.arraycopy(arr, 0, duplicatearray, arr.length, arr.length);
        return duplicatearray;
    }

}
