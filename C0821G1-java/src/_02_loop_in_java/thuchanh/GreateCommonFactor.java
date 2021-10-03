package _02_loop_in_java.thuchanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        //Tìm ước số chung lớn nhất của hai số.
        //Nếu số nguyên a % b == 0 => b là ước của số a, a là bội của b.
        //Số nguyên dương b lớn nhất là ước của cả hai số nguyên a, b => b là ước số chung lớn nhất của a và b.
        //Trường hợp:
        //a == 0 && b == 0 thì mọi số tự nhiên khác không đều là ước chung của a và b.
        // a == 0 || b == 0, số kia khác 0 thì ƯCLN của chúng bằng giá trị tuyệt đối của số khác 0.

        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        //Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        //Tìm ước số chung lớn nhất của a, b
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
