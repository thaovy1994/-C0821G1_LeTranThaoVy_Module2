package _03_array_and_method_in_java.practice.find_element_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        //Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
