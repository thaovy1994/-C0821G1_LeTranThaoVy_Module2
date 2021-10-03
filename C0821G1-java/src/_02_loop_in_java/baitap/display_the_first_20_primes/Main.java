package _02_loop_in_java.baitap.display_the_first_20_primes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of integers need to print: "); //số lượng số nguyên tố cần in ra.
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            if (isPrimeNumber(n)) {
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
//        if (n < 2) {
//            return false;
//        }
        // check so nguyen to khi n >= 2
        boolean check = true;
        ;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}