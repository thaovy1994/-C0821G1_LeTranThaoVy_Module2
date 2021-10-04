package _03_array_and_method_in_java.exercise.remove_element_from_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Độ dài mảng
        //nếu N < 0 thi nhập lại
        int N;
        do {
            System.out.print("Enter the size N: ");
            N = scanner.nextInt();
        } while (N < 0);

        //Khai báo và nhập giá trị các phần tử trong mảng
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //hiển thị mảng ban đầu
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }

        //Nhập X là phần tử cần xoá
        System.out.println("Enter x:");
        int x = scanner.nextInt();

        //Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        boolean check = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (x == array[i]) {
                check = true;
                System.out.println(x + " at index " + i);
                break;
            }
            if (check) {
                System.out.println("Not found " + x + " in array");
            }
        }
        //Thực hiện xoá phần tử X khỏi mảng
        //Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
        int i, c;
        for (c = i = 0; i < N; i++) {
            if (array[i] != x) {
                array[c] = array[i];
                c++;
            }
        }
        N = c;

        //In ra mảng đã xóa,
        System.out.println("array which is removed " + x + " is: ");
        for (i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
