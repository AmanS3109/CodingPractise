package Java;

class ReverseString {
    public static void main(String[] args) {
        String str = "Aman is Genius";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) { //reverse the loop
            rev += str.charAt(i); //charAt is a method in java takes character at the current index
        }
        System.out.println(rev);

    }
}