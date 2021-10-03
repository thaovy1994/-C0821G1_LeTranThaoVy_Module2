package _02_loop_in_java.baitap.display_prime_smaller_100;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.print("prime which is smaller than 100: ");
        for (int i =2; i<=100;i++){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        boolean check = true;;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}