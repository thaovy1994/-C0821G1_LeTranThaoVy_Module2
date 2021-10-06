package _03_array_and_method_in_java.exercise.remove_element_from_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        //Độ dài mảng
        //nếu N < 0 thi nhập lại
        do {
            System.out.print("Enter the size N: ");
            n = scanner.nextInt();
        } while (n < 0);

        //Khai báo và nhập giá trị các phần tử trong mảng
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        //hiển thị mảng ban đầu
        System.out.println("\nArray at fist: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        //Nhập X là phần tử cần xoá
        System.out.println("Enter x:");
        int x = scanner.nextInt();

        //Cách 1: kiểm tra xem x có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
//        boolean check = false;
//        for (int i = 0; i < n - 1; i++) {
//            if (x == array[i]) {
//                check = true;
//                System.out.println(x + " at index " + i);
//                break;
//            }
//            if (check) {
//                System.out.println("Not found " + x + " in array");
//            }
//        }
        //Cách 2: tìm x trong mảng:
        //vị trí cần xóa. Khai báo tên biến như position hoặc index_del đều được
        int index_del = -1;
        for (int index = 0; index < array.length; index++) {
            if (x == array[index]) {
                index_del = index;
                break;
            }
        }

        if (index_del != -1) { //da tim thay x

            //chuc nang xoa phan tu tai index pos ra khoi mang
            for (int index = index_del; index < array.length - 1; index++) { //index = 7
                array[index] = array[index + 1];
            }
            array[array.length - 1] = 0;
        } else {
            System.err.println("Not found x = " + x);
        }

//Dùng lớp tiện ích để in ra mảng
//        System.out.println("Array after: " + Arrays.toString(arr));
//    }
//}

        //Có thể xóa phần tử khỏi mảng bằng cách khác (khó hiểu hơn)
//        int i, c;
//        for (c = i = 0; i < n; i++) {
//            if (array[i] != x) {
//                array[c] = array[i];
//                c++;
//            }
//        }
//        n = c;

        //In ra mảng đã xóa,
        System.out.println("array which is removed " + x + " is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
