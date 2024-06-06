package Java;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
    
    static boolean isPrime(int n){
        int divisor = 2;
        while (divisor < n){
            if (n % divisor == 0){
                return false;
            }
            divisor++;
        }
        return true;
    }
}