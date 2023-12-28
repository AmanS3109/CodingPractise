package Java;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        StringBuilder reversed = new StringBuilder();
        int remainder;
    
        // Reverse the digits using a loop
        while (num != 0) {
            remainder = num % 10; // Extract the last digit
            reversed.append(remainder); // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }
    
        // Convert the reversed string back to an integer
        return Integer.parseInt(reversed.toString());
    }
    
    public static void main(String[] args) {
        int reversedNum = reverseNumber(12345);
        System.out.println(reversedNum);
    }
}
