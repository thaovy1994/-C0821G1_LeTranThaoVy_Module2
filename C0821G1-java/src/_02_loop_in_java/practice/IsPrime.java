package _02_loop_in_java.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        //trong hàm main: Khai báo biến number và nhập cho number giá trị từ bàn phím.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        //Kiểm tra số vừa nhập có phải là số nguyên tố
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                //tối ưu đoạn code: thay i<number thành i <= Math.sqrt(number)
                //chỉ cần kiểm tra căn bậc 2 của một số
                //là đã có thể biết được số đó có phải số nguyên tố hay không ?
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
