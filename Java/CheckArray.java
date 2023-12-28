package Java;

public class CheckArray {
    public static void main(String[] args) {
        Object obj = new int[]{1, 2, 3};
        if (obj.getClass().isArray()) {
            System.out.println("The object is an array");
        } else {
            System.out.println("The object is not an array");
        }
    }
}
